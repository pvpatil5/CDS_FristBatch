package com.constructor;

public class Cricket 
{
	static Cricket c1=null;

	private Cricket() {
		System.out.println("Executing constructor");
	}

	public void oneday() {
		System.out.println("One Day");
	}

	public static Cricket getInstance() 
	{
		c1= new Cricket();
		return c1;
	}

	

}
