package com.java.program;

public class ReverseEachWord {

	public static void main(String[] args) {
		 
		String str1 = "How are you Karishma";
		
		String result = "";
		String[] str3 = str1.split(" ");
		
		for(String word :str3)
		{
			String str2 ="";
		int j = word.length()-1;
		while(j>=0)
		{
			char c = word.charAt(j);
			str2 = str2+c;
			j--;
		}
			
		result= result+str2+" ";
		}
		
		System.out.println(result);

	}

}
