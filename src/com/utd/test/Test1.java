package com.utd.test;

public class Test1 {

	int a;
	public Test1() {
		System.out.println("DC:");
	}
	public Test1(int a) {
		this.a = a;
		System.out.println("PC");
	}
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1(10);
		
	}

}
