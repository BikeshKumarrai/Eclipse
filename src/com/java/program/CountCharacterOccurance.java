package com.java.program;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String str = "Java programing language is very easy";
		
		// Jv programing lnguge is very esy
         int string = str.length()-str.replaceAll("a", "").length();
         
         System.out.println(string);
	}

}
