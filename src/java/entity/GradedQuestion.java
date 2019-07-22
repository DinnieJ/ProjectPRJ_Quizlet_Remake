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
public class GradedQuestion extends Question {
    private int point;

    public GradedQuestion(int point) {
        this.point = point;
    }

    public GradedQuestion(String questionID, String content, String[] answer, String correctAns, String questionSet,int point) {
        super(questionID, content, answer, correctAns, questionSet);
        this.point = point;
    }
    public GradedQuestion(Question q,int point){
        super(q.getQuestionID(),q.getContent(),q.getAnswer(),q.getCorrectAns(),q.getQuestionSet());
        this.point = point;
    }
    
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
    public void addedPoint(){
        this.point++;
    }
    public void minusPoint(){
        this.point--;
    }
    
    
}
