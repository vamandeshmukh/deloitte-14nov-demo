package com.deloitte.demo.oop.po;

public class Calc {

	public static long addNums(int i, int j) {
		System.out.println(i + j);
		return i + j;
	}

	public static long addNums(int i, long j) {
		System.out.println(i + j);
		return i + j;
	}

	public static void addNums(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	public static void addNums(int i, int j, int k, int l) {
		System.out.println(i + j + k + l);
	}
}
