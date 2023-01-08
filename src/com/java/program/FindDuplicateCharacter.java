package com.java.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		
		System.out.println("Enter any character which you want to check");
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		
		//String str = "Laptop";
		char[] charArray = next.toCharArray();
		
		int count =1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<charArray.length;i++)
		{
			if(!map.containsKey(charArray[i]))
			{
				map.put(charArray[i], count);
			}
			else
			{
				map.put(charArray[i], map.get(charArray[i])+1);
			}
		}
		for(Character x: map.keySet())
		{
			if(map.get(x)>1)
			{
				System.out.println("Character is:"+x+ "="+map.get(x));
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
