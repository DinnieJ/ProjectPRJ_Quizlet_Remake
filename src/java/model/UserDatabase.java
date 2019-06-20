/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MemeLord
 */
public class UserDatabase {
    private DBContext _db;
    private Connection _dbConnection;

    public UserDatabase() {
        _db = new DBContext("localhost", "ProjectPRJ_Quizlet", "1433", "sa", "123");
        try {
            _dbConnection = _db.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public User getUser(String username,String password){
        User u = null;
        String query = "select * from [User] where Username=? and password=?";
        try {
            PreparedStatement statement = this._dbConnection.prepareCall(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                u = new User(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void addUser(User u){
        String query = "insert into [User] values(?,?,?,?)";
        try{
            PreparedStatement statement = this._dbConnection.prepareCall(query);
            statement.setString(1, u.getUsername());
            statement.setString(2, u.getPassword());
            statement.setString(3, u.getEmail());
            statement.setString(4, u.getName());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isExistUser(String username){
        String query = "select * from [User] where username=?";
        try{
            PreparedStatement statement = this._dbConnection.prepareCall(query);
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
