package edu.matc.persistence;

import org.apache.log4j.Logger;
import org.hibernate.metamodel.relational.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.*;


/**
 * Created by David on 10/20/16.
 */
public class DatabaseConnection {

    private static DatabaseConnection instance = new DatabaseConnection();

    private Connection connection;

    private final Logger log = Logger.getLogger(this.getClass());

    public DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        return instance;
    }

    public Connection getConnection(){
        return connection;
    }

    public void connect() throws Exception {
        if (connection != null)
            return;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Error: Driver not found");
        }
        String url = "jdbc:mysql://localhost:3306/mtg_matchups";

        connection = DriverManager.getConnection(url, "root", "moonshine24");

    }

    public void disconnect(){
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                log.error("Cannot close connection");
            }
            connection = null;
        }
    }

}
