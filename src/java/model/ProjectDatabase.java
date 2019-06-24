/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.ProjectSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MemeLord
 */
public class ProjectDatabase {
    private DBContext _db;
    private Connection _dbConnection;

    public ProjectDatabase() {
        _db = new DBContext("localhost", "ProjectPRJ_Quizlet", "1433", "sa", "123");
        try {
            _dbConnection = _db.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<ProjectSet> getAllProject(String username){
        List<ProjectSet> list = new ArrayList<>();
        String query = "select * from [QuestionSet] where creator = ?";
        try{
            PreparedStatement statement = this._dbConnection.prepareCall(query);
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                list.add(new ProjectSet(rs.getString(1),rs.getString(2), rs.getString(4), rs.getString(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
    public void addProject(ProjectSet p){
        String query = "insert into [QuestionSet] values(?,?,?,?)";
        try{
            PreparedStatement statement = this._dbConnection.prepareCall(query);
            statement.setString(1, p.getSetID());
            statement.setString(2, p.getSetName());
            statement.setString(3, p.getCreator());
            statement.setString(4, p.getDescription());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String idGenerator(String prjName){
        String id="";
        Date d = new Date();
        int day = d.getDay();
        int month = d.getMonth();
        int year = (d.getYear()+1900)%100;
        int hrs = d.getHours()+1;
        int minute = d.getMinutes()+1;
        int second = d.getSeconds();
        String[] splitName = prjName.split(" ");
        id = Integer.toString(day)+Integer.toString(month)+Integer.toString(year)+Integer.toString(hrs)+Integer.toString(minute)+Integer.toString(second);
        for(int i = 0;i<splitName.length;i++){
            id+= Character.toUpperCase(splitName[i].charAt(0));
        }
        System.out.println(id);
        return id;
    }
}
