package com.java.program;

import java.util.Scanner;

public class ReverseString {
                 public static void main(String[] args) {
                	 System.out.println("Give any string");
                	 Scanner scan = new Scanner(System.in);
                	 String string = scan.next();
                	 
					 String str1 = string;
					 String str2 = "";
					 for(int i=str1.length()-1;i>=0;i--)
					 {
						 str2 =str2+str1.charAt(i);
					 }
					 
					 System.out.println(str2);
					 
					 // by using StringBuffer
					 
					/* StringBuffer buffer = new StringBuffer(str1);
					 StringBuffer reverse = buffer.reverse();
					 System.out.println(reverse);*/
				}
                 
}
