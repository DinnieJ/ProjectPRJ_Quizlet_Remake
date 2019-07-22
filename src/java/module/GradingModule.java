/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import entity.GradedQuestion;
import entity.Question;
import java.util.List;
import model.QuestionDatabase;

/**
 *
 * @author MemeLord
 */
public class GradingModule extends QuestionDatabase {
    private List<GradedQuestion> gradedQuesList;
    private int currentMarking;
    private int totalPoint;
    private int currentPoint;
    public GradingModule(){
        
    }
    
    private void getAllQuestionFromSet(String id){
        List<Question> list = getAllQuestion(id);
        for(Question q: list){
            GradedQuestion g = new GradedQuestion(q,0);
            gradedQuesList.add(g);
        }
        currentMarking = gradedQuesList.size()/2;
        totalPoint = gradedQuesList.size()*2;
        currentPoint = 0;
    }
    
    public GradedQuestion dequeueList(){
        return gradedQuesList.remove(0);
    }
    
    public void enqueueList(GradedQuestion g){
        gradedQuesList.add(g);
    }
    
    public void enqueueMiddle(GradedQuestion g){
        gradedQuesList.add(currentMarking, g);
    }
    
    public double getPercent(){
        for(GradedQuestion g: gradedQuesList) currentPoint+=g.getPoint();
        return (currentPoint/totalPoint)*100;
    }
}
