package com.java.program;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println("Give any sentence");
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		
		String str = line;
		String str3 = "";
		String[] str2 = str.split(" ");
		for(int i= str2.length-1;i>=0;i--)
		{
			str3= str3+str2[i]+" ";
		}
		System.out.println(str3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
