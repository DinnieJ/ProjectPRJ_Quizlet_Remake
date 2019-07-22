/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Question;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    public List<Question> getAllQuestion(String setID){
        String query = "Select * from Question where QuestionSetID = ?";
        List<Question> questionList = new ArrayList<>();
        try{
            PreparedStatement st = this._dbConnection.prepareCall(query);
            st.setString(1, setID);
            ResultSet result = st.executeQuery();
            while(result.next()){
                String[] answer = {result.getString(3),result.getString(4),result.getString(5),result.getString(6)};
                questionList.add(new Question(result.getString(1), result.getString(2), answer, result.getString(7), result.getString(8)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return questionList;
    }
    
    public void deleteQuestion(String questionID){
        String query ="delete from [Question] where QuestionID=?";
        try{
            PreparedStatement st = this._dbConnection.prepareCall(query);
            st.setString(1, questionID);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Question> getRandomQuestion(int numOfQuestion,String setID){
        String query = "Select top(?) * from [Question] where [QuestionSetID]= ? order by newid()";
        List<Question> questionList = new ArrayList<>();
        try{
            PreparedStatement st = this._dbConnection.prepareCall(query);
            st.setInt(1, numOfQuestion);
            st.setString(2, setID);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                String[] answer = {rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                questionList.add(new Question(rs.getString(1), rs.getString(2),answer , rs.getString(7), rs.getString(8)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return questionList;
    }
    
    
}
