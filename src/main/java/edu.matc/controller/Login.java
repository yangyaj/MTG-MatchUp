package edu.matc.controller;

import edu.matc.persistence.DatabaseConnection;
import edu.matc.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;

/**
 * Created by David on 10/22/16.
 */

@WebServlet(name= "login", urlPatterns = {"/login"} )
public class Login extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserDao userdao = new UserDao();
        if (userdao.checkUsernamePassword(username, password) == true) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            response.sendRedirect("loginSuccess.jsp");
        } else {
            request.setAttribute("errorMessage", "Username or password incorrect.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
            dispatcher.forward(request, response);
        }
    }
}
