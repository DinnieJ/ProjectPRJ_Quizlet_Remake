/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Question;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MemeLord
 */
public class QuestionDatabase {
    private DBContext _db;
    private Connection _dbConnection;

    public QuestionDatabase() {
        _db = new DBContext("localhost", "ProjectPRJ_Quizlet", "1433", "sa", "123");
        try {
            _dbConnection = _db.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(UserDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addQuestion(Question q){
        String query = "insert into [Question](Content,AnswerContent_A,AnswerContent_B,AnswerContent_C,AnswerContent_D,CorrectAnswer,QuestionSetID) values(?,?,?,?,?,?,?)";
        try{
            PreparedStatement statement = this._dbConnection.prepareCall(query);
            statement.setString(1, q.getContent());
            statement.setString(2, q.getAnswer()[0]);
            statement.setString(3, q.getAnswer()[1]);
            statement.setString(4, q.getAnswer()[2]);
            statement.setString(5, q.getAnswer()[3]);
            statement.setString(6, q.getCorrectAns());
            statement.setString(7, q.getQuestionSet());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
