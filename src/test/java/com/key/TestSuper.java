package com.key;

public class TestSuper extends SuperDemo1{


	public  void changeValues() {
		super.a=50;
		super.b=150;
		System.out.println(super.a+super.b);
	}
	public void callMethod() {
		super.add(800, 120);
	}




	public static void main(String[] args) {

		TestSuper t1 = new TestSuper();
	//	t1.changeValues();
		t1.callMethod();

	}

}
