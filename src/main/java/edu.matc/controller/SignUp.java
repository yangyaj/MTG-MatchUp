package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by David on 10/20/16.
 *
 * This servlet adds users to database
 *
 */

@WebServlet(name="signUp", urlPatterns = {"/signUp"})

public class SignUp extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User registerUser = new User(
                        request.getParameter("firstName"),
                        request.getParameter("lastName"),
                        request.getParameter("email"),
                        request.getParameter("username"),
                        request.getParameter("password"));

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        log.debug("Adding this User" + registerUser);

        UserDao userdao = new UserDao();

        //if(!userdao.userExists(registerUser.getUsername())) {
            userdao.addUser(registerUser);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/signUpSuccess.jsp");
            dispatcher.forward(request, response);
        //} else {
          //  request.setAttribute("errorMessage", "Username is already in use, please use another.");
            //RequestDispatcher dispatcher = request.getRequestDispatcher("/signUpFail.jsp");
        }
    }
