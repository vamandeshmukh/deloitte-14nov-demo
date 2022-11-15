package com.deloitte.demo.st;

public class StaticDemo {

	public static void main(String[] args) {

		BankCustomer obj = new BankCustomer();

//		BankCustomer.accountNumber = "HDFC001"; // Error 
		obj.accountNumber = 245098762;
//		obj.ifsc = "HDFC001"; // Warning 
		BankCustomer.ifsc = "HDFC001";

	}

}
