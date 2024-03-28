package com.quiz;
import static java.lang.System.out;

import java.io.File;
import java.util.Scanner;

import com.quiz.helper.QuestionService;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		QuestionService service=new QuestionService();
        
//		Date[] list=new Date[5];
//		list[0]=new SimpleDateFormat("yyyy-MM-dd").parse("2023-02-01");
//		list[1]=new SimpleDateFormat("yyyy-MM-dd").parse("2023-02-19");
//		list[2]=new SimpleDateFormat("yyyy-MM-dd").parse("2023-04-29");
//		list[3]=new SimpleDateFormat("yyyy-MM-dd").parse("2023-01-07");
//		list[4]=new SimpleDateFormat("yyyy-MM-dd").parse("2023-08-29");
//		
//		for(Date d : list) {
//			System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(d));
//		}
//		System.out.println("********************");
//		Comparator<Date> comp = (o1,o2)-> o1.compareTo(o2);
//		Arrays.sort(list,comp);
//			for(Date d : list) {
//				Calendar calendar = Calendar.getInstance();
//		        calendar.setTime(d);
//		        calendar.add(Calendar.DAY_OF_MONTH, -1);
//		        Date updatedDate = calendar.getTime();
//				System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(updatedDate));
//			}
		

		String argu=null;
        do {
        	service.getQuestions();
            service.playQuiz();
            service.showAnswer();
            out.println("******************************");
            out.println("You Want to Play Again (Y/N) ?");
            argu=new Scanner(System.in).nextLine();
        }while(argu.equalsIgnoreCase("Y"));
        
        if(!argu.equalsIgnoreCase("Y")) {
        	out.println("Thanks for Playing Quiz...!");
        }
	}
}