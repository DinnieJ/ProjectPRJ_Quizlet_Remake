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
public class Question {
    private String questionID;
    private String content;
    private String[] answer;
    private String correctAns;
    private String questionSet;

    public Question() {
    }

    public Question(String questionID, String content, String[] answer, String correctAns, String questionSet) {
        this.questionID = questionID;
        this.content = content;
        this.answer = answer;
        this.correctAns = correctAns;
        this.questionSet = questionSet;
    }

    public Question(String content, String[] answer, String correctAns, String questionSet) {
        this.content = content;
        this.answer = answer;
        this.correctAns = correctAns;
        this.questionSet = questionSet;
    }
    
    public String getQuestionID() {
        return questionID;
    }

    public String getContent() {
        return content;
    }

    public String[] getAnswer() {
        return answer;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public String getQuestionSet() {
        return questionSet;
    }
    
    
    
}
