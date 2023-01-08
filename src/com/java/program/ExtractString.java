package com.java.program;

public class ExtractString {

	public static void main(String[] args) {
		
		String str ="I am learning java program";
		String first = str.substring(0, 4);
		System.out.println(first);
		
		String middle = str.substring(5, 18);
		System.out.println(middle);
		
		String last = str.substring(str.length()-7, str.length());
		System.out.println(last);
	}

}
