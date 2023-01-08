package com.java.program;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int [] a = {2,3,3,4,5,6,7,7,8,9,9};
		
		DuplicateArray.brute(a);
	}

	private static void brute(int [] arr) {
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j]) {
					System.out.println("the duplicare array is:" + arr[i]);
				}
			}
		}
	}
}
