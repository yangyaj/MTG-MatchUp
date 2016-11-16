package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.servlet.annotation.WebServlet;

/**
 * Created by David on 10/25/16.
 */

@Entity
@Table(name = "users_roles", schema = "mtg_matchups")
public class UserRoles {

    private String username;
    private String role;

    @Column(name = "username", nullable = false, length = 30)
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    @Column(name = "role", nullable = false, length = 30)
    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

}
