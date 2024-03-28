package com.quiz.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.quiz.db.DBConnection;
import com.quiz.helper.Question;

public class QuestionDaoImplementation{

	public List<Question> getQuestions()  throws Exception{
		Connection conn=DBConnection.getConnection();
		List<Question> list=new ArrayList<>();
		ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM mst_question order by rand() limit 5");
		while(rs.next()) {
			Question question=new Question();
			question.setId(Integer.parseInt(rs.getString("question_id")));
			question.setQuestion(rs.getString("question"));
			question.setOption_1(rs.getString("option_1"));
			question.setOption_2(rs.getString("option_2"));
			question.setOption_3(rs.getString("option_3"));
			question.setOption_4(rs.getString("option_4"));
			question.setAnswer_idx(rs.getString("answer_idx"));
			question.setAnswer(rs.getString("answer"));
			
			list.add(question);
		}
//		return list.stream().filter(data -> data.getId()%2 ==0).collect(Collectors.toList());
		return list;
	}
}
