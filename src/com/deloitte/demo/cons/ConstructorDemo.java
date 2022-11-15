package com.deloitte.demo.cons;

/*
 * Constructor - 
 * - a special type of method 
 * - needed to create objects 
 * - name is same as class name 
 * - does not have return type
 * - available by default 
 * - can also be created manually 
 * - if we create our constructors, 
 * - then default constructor is not available 
 * - one class can have one or more constructors  
 */

public class ConstructorDemo {

	public static void main(String[] args) {

		Employee obj = new Employee();
		obj.eid = 101;
		obj.firstName = "Sonu";
		obj.salary = 90000;
		System.out.println(obj.toString());

		Employee obj2 = new Employee();
		obj2.eid = 102;
		obj2.firstName = "Monu";
		obj2.salary = 95000;
		System.out.println(obj2.toString());

		Employee obj3 = new Employee(103, "Tonu", 99000);
		System.out.println(obj3.toString());

		Employee obj4 = new Employee("Tonu", 99000);
		System.out.println(obj4.toString());
	}

}
