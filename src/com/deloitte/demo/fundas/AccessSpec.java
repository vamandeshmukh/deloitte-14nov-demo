package com.deloitte.demo.fundas;

public class AccessSpec {

	private int num = 10;
	int num2 = 20;
	protected int num3 = 30;
	public int num4 = 40;

	public static void main(String[] args) {

		AccessSpec obj = new AccessSpec();
		System.out.println(obj.num);
		System.out.println(obj.num2);
		System.out.println(obj.num3);
		System.out.println(obj.num4);

	}

}
