/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author MemeLord
 */
public class User {
    private String username;
    private String password;
    private String email;
    private String name;

    public User(String username, String password, String email,String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public User() {
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    
}
