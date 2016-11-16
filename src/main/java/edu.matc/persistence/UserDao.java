package edu.matc.persistence;

import edu.matc.entity.User;
import edu.matc.entity.UserRoles;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.annotations.SourceType;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 10/20/16.
 */
public class UserDao {
    private final Logger log = Logger.getLogger(this.getClass());


    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        session.createCriteria(User.class).list();

        return users;
    }

    public boolean checkUsernamePassword(String username, String password){

        //if (userExists(username)) {
            Session session = SessionFactoryProvider.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(User.class);

            User loginUser = (User) criteria.add(Restrictions.eq("username", username)).uniqueResult();

            if (password.equals(loginUser.getPassword())) {
                return true;
            }
            return false;
        }

       // return false;

    //}

    public boolean userExists(String username) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(User.class);

        List<User> checkAvailability = criteria.add(Restrictions.eq("username", username)).list();

        if(checkAvailability.size() == 0){
            return true;
        } else {
            return false;
        }
        //return true if username exists in a user
        //return false if no user has that username



    }



    public String addUser(User user) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        String newUser = null;

        try
        {
            tx = session.beginTransaction();
            newUser = (String) session.save(user);
            tx.commit();
        } catch (
                HibernateException e
                )
        {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return newUser;
    }



}
