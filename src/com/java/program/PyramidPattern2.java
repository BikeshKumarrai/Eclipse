package com.java.program;

public class PyramidPattern2 {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=k;j=j++)
			{
				System.out.print("* ");
			}
			k= k+2;
			System.out.println();
		}

	}

}
