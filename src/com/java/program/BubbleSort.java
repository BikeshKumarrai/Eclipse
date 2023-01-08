package com.java.program;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {9, 90,76,5,7,1};
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j =0;j<a.length-1;j++)
			{
				int temp=a[j];
				if(a[j]>a[j+1])
				{
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
 System.out.println(Arrays.toString(a));
	}

}
