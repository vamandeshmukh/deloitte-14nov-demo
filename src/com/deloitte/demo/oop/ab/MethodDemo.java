package com.deloitte.demo.oop.ab;

public class MethodDemo {

	public static void addNums(int i, int j) // what does this method do?
	{										// How does it do it?
		System.out.println(i + j);
	}

	public static void main(String[] args) {
		System.out.println("main");
		MethodDemo.addNums(10, 20);
	}

}
