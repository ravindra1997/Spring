package com.techouts.Map;

import java.util.Map;

public class Question 
{
	private int sno;
	private String question;
	private Map<Answer, User> mp;
	public Question(int sno, String question, Map<Answer, User> mp) {
		super();
		this.sno = sno;
		this.question = question;
		this.mp = mp;
	}
	public void display()
	{
		System.out.println("S.no:"+sno);
		System.out.println("The Question is :"+question);
		for(Map.Entry<Answer, User> e:mp.entrySet())
		{
			System.out.println("Answer details:");
			System.out.println(e.getKey());
			System.out.println("Posted By :");
			System.out.println(e.getValue());
		}
	}

}
