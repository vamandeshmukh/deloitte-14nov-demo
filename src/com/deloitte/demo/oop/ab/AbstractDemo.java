package com.deloitte.demo.oop.ab;

abstract class AbClass {

}

interface Int1 {

	public abstract void absMethod();
//	void absMethod();

	public static void nonAbsMethod() {
		System.out.println("nonAbsMethod");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {

		Int1.nonAbsMethod();

//		AbClass obj = new AbClass();		
//		Int1 obj2 = new Int1();

	}

	// a class can extend only one another class
	// a class can implement one or more interfaces
	// a class can do both of the above
	// abstract method has only method signature
	// it can be created only in an abstract class or in an interface
	// abstract method need to be implemented in a concrete class to use it

}

/*
 * self learning topics 
 * exception handling 
 * collection framework 
 * functional interface 
 * lamdba methods 
 * streams API 
 * functional programming in Java
 * 
 */
















