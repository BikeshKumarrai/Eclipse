package com.java.program;

public class LargestSmallestElement {

	public static void main(String[] args) {


		int[] a = {4,5,90,87,45,18,20,200};
		
		int largest =a[0];
		int smallest =a[0];
		
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			else if(a[i]<smallest)
			{
			smallest = a[i];
			}
		}
      System.out.println(largest);
      System.out.println(smallest);
	}

}
