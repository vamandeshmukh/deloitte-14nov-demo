package com.deloitte.demo;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num:");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Thee");
			break;
		default:
			System.out.println("Other");
			break;
		}
		sc.close();

	}

}
