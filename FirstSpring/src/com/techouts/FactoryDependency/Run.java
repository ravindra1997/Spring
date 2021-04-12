package com.techouts.FactoryDependency;

public class Run
{
	
	public Run()
	{
		System.out.println("Hello Constructor");
	}
	public static Run getRun()
	{
		System.out.println("Hello Runner");
		return new Run();
	}
	public void runs()
	{
		System.out.println("runner is m");
	}

}
