/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

import entity.Question;
import entity.TestQuestion;
import java.util.ArrayList;
import java.util.List;
import model.QuestionDatabase;

/**
 *
 * @author MemeLord
 */
public class TestModule {
    
    private List<TestQuestion> testQuestionList;
    private QuestionDatabase qdb;
    private String username;
    private double mark;
    
    public TestModule(){
        
    }

    public String getUsername() {
        return username;
    }
    public String getSetID(){
        return testQuestionList.get(0).getQuestionSet();
    }
    public TestModule(String username) {
        this.testQuestionList = new ArrayList<>();
        this.username = username;
        this.mark = 0;
        qdb = new QuestionDatabase();
    }
    
    public double getTotalMark(){
        return(mark/testQuestionList.size())*10;
    }

    public double getMark() {
        return mark;
    }
    
    
    public void getAllTestQuestion(String id){
        List<Question> question = qdb.getRandomQuestion(10,id);
        System.out.println(question.size());
        int i = 0;
        for(Question q: question){
            testQuestionList.add(new TestQuestion(q));
            System.out.println(testQuestionList.get(i).toString());
            i++;
        }
    }

    public List<TestQuestion> getTestQuestionList() {
        return testQuestionList;
    }
    
    public void markingTest(String[] answer){
        List<Character> fullAns = new ArrayList<>();
        for(int i = 0;i<testQuestionList.size();i++){
            fullAns.add('#');
        }
        for(int i = 0;i<answer.length;i++){
            int num = Integer.parseInt(answer[i].substring(0,answer[i].length()-1));
            char a = answer[i].charAt(answer[i].length()-1);
            fullAns.set(num, a);
        }
        for(int i = 0;i<fullAns.size();i++){
            if(fullAns.get(i)=='#') continue;
            else if(testQuestionList.get(i).getCorrectAns().equalsIgnoreCase(Character.toString(fullAns.get(i)))){
                testQuestionList.get(i).setIsCorrect(true);
                mark++;
            }
        }
    }
}
