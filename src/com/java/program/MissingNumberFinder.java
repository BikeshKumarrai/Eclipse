package com.java.program;

public class MissingNumberFinder {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,6,7,8,9,10};
		int sum=0;
		int expectedsum =0;
		for(int i =0; i<=a.length-1;i++)
		{
			sum= sum+a[i];
		}
		//System.out.println(sum);
		
		for(int i=1;1<=10;i++)
		{
			expectedsum =expectedsum+i;
		}
		
	System.out.println("The missing number is:" + (expectedsum-sum));
	
	}

}
