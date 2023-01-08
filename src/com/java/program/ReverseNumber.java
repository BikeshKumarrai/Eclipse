package com.java.program;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Give any number");
		Scanner scan = new Scanner(System.in);
		  int a =scan.nextInt();
		//int num =a;
		int result =0;
		 while(a>0) {
			 result = result*10+a%10;
			 a=a/10;
		 }
      System.out.println(result);
	}

}
