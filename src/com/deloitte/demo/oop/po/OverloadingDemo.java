package com.deloitte.demo.oop.po;

public class OverloadingDemo {

	public static void main(String[] args) {

//		Calc.addNums(10); // CE 
		Calc.addNums(10, 20);
		Calc.addNums(10, 21L);
		Calc.addNums(10, 20, 30);
		Calc.addNums(10, 20, 30, 40);
//		Calc.addNums(10, 20, 30, 40, 50); // CE 

	}

}
