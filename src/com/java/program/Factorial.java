package com.java.program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("give any number which you want to know the factorial value");
		Scanner scan = new Scanner(System.in);
		int int1 = scan.nextInt();
		 int fact =1;
		 for(int i=1;i<=int1;i++)
		 {
			 fact = fact*i;
		 }
		
		
		System.out.println(fact);
		
		

	}

}
