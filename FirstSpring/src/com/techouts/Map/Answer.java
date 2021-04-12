package com.techouts.Map;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Answer 
{
	private int num;
	private String answer;
	private Date date;
	//int dateFormat=date.getDate();
	public Answer(int num, String answer, Date date) {
		super();
		this.num = num;
		this.answer = answer;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Answer [num=" + num + ", answer=" + answer + ", date=" + date + "]";
	}
	
	

}
