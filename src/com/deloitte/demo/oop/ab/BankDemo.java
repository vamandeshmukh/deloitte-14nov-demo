package com.deloitte.demo.oop.ab;

interface FinMin {

	public abstract void paySalary();

}

abstract class Rbi {

	// concrete method - has both - method signature and method body
	public void payInterest() {
		System.out.println("pay interest on deposits");
	}

	// abstract method - has only- method signature
	public abstract void doKyc();
}

class IciciBank extends Rbi implements FinMin {

	@Override
	public void doKyc() {
		System.out.println("Kyc with Aadhaar");
	}

	@Override
	public void paySalary() {
		System.out.println("Icici paying salary");
	}
}

class HdfcBank extends Rbi implements FinMin {

	@Override
	public void doKyc() {
		System.out.println("Kyc with PAN");
	}

	@Override
	public void paySalary() {
		System.out.println("Hdfc paying salary");
	}
}

public class BankDemo {

	public static void main(String[] args) {

		HdfcBank bank1 = new HdfcBank();
		bank1.doKyc();
		bank1.payInterest();
		bank1.paySalary();
	}
}
