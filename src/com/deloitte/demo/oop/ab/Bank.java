package com.deloitte.demo.oop.ab;

abstract class Rbi {

	// concrete method - has both - method signature and method body
	public void payInterest() {
		System.out.println("pay interest on deposits");
	}

	// abstract method - has only- method signature
	public abstract void doKyc();

}

class IciciBank extends Rbi {

	public void doKyc() {
		System.out.println("Kyc with Aadhaar");
	}

}

class HdfcBank extends Rbi {

	public void doKyc() {
		System.out.println("Kyc with PAN");
	}
}

public class Bank {

	public static void main(String[] args) {

		HdfcBank bank1 = new HdfcBank();
		bank1.doKyc();
		bank1.payInterest();

	}

}
