package com.java.program;

import java.util.Arrays;

public class AnagramString {
	
          public static void main(String[] args) {
        	  
        	  String str1 = "mary";
        	  String str2 = "army";
        	  
        	  char[] cs = str1.toLowerCase().toCharArray();
        	  char[] cs2 = str2.toLowerCase().toCharArray();
        	  
        	  Arrays.sort(cs);
        	  Arrays.sort(cs2);
        	  if(Arrays.equals(cs, cs2))
        	  {
        		  System.out.println("Given strings are Anagram");
        	  }
        	  else
        	  {
        		  System.out.println("Given String are not Anagram");
        	  }
	
}
}
