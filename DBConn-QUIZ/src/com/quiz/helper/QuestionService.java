package com.quiz.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import com.quiz.dao.QuestionDaoImplementation;

import static java.lang.System.*;

public class QuestionService{

	List<Question> list =new ArrayList<>();
	String userName=null;
	// create a Questions...
    @SuppressWarnings("resource")
	public void getQuestions() throws Exception {
    	out.print("Please Enter Your Name...");
    	userName=new Scanner(System.in).nextLine();
    	try {
			 list = new QuestionDaoImplementation().getQuestions();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }


    public void playQuiz() {
    	
        AtomicInteger score=new AtomicInteger(0);
        AtomicInteger qId=new AtomicInteger(1);
        list.forEach(question ->{
        	
        	out.print("Q" +qId+ ".  ");
            out.println(question.getQuestion());
            // Options...
            out.println("     a) "+question.getOption_1());
            out.println("     b) "+question.getOption_2());
            out.println("     c) "+question.getOption_3());
            out.println("     d) "+question.getOption_4());
            
            
            @SuppressWarnings("resource")
			String userAnswer=new Scanner(System.in).nextLine();
            if(userAnswer.equalsIgnoreCase(question.getAnswer_idx()) || userAnswer.equalsIgnoreCase(question.getAnswer())){
            	score.getAndAdd(1);
            }
            qId.getAndAdd(1);
        });
        out.println("****************************************************************");
        out.println(userName+" Your Final Score is : " + score+"/"+list.size());
        out.println("****************************************************************");
    }

    @SuppressWarnings("resource")
	public void showAnswer(){
        out.println("Are You Want to See Answer of Each Questions?  (Y / N) ");
        if (new Scanner(System.in).nextLine().equalsIgnoreCase("Y")) {
            displayAnswer();
        }

    }
    
    public void displayAnswer() {
    	
    	list.forEach(question ->{
    		out.println("Q"+question.getId() + ". " + question.getQuestion());
            out.println("Ans : " + question.getAnswer());
    	});
    	
    }
    

}
