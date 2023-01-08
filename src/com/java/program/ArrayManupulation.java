package com.java.program;

public class ArrayManupulation {

	public static void main(String[] args) {
		
		String[] str= {"Sunday","Monday","Tuesday","Wednesday","Friday","Saturday"};
		
		String[] b =new String[str.length];
		for(int i=0;i<=str.length-1;i++)
		{
		b[i]=str[i].substring(0, 3);
		
		
		}
		for(String x :b)
		{
			System.out.println(x);
		}
	}
}

