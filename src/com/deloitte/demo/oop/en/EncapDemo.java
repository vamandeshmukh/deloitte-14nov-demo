package com.deloitte.demo.oop.en;

/*
 * Encapsulation - 
 * process to bind data and code together 
 * 
 * create private fields and 
 * create public methods to access those fields 
 * (getters, setters)
 */

public class EncapDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();

		System.out.println(emp.toString());

		System.out.println(emp.getSalary()); // CE

		emp.setSalary(10000);

		System.out.println(emp.getSalary()); // CE

		System.out.println(emp.toString());

	}

}
