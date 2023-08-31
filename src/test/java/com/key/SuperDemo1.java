package com.key;

public class SuperDemo1 
{
	// this keyword 
	// super keyword


	int a =10;

	int b =20;

	public SuperDemo1() 
	{

	}

	public void m1() {

		this.add(40, 50);
	}
	public void add(int e,int f) {
		this.a=e;
		this.b=f;
		System.out.println(a+b);

	}

}
