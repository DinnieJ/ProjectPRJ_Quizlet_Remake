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
public class TestQuestion extends Question{
    private boolean isCorrect;
    
    public TestQuestion(Question q){
        super(q.getQuestionID(), q.getContent(), q.getAnswer(), q.getCorrectAns(), q.getQuestionSet());
        this.isCorrect = false;
    }
    
    public void check(){
        this.isCorrect = true;
    }

    public boolean isCorrectAnswer() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
    public String toString(){
        return "Added";
    }
    
}
