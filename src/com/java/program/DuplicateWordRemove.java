package com.java.program;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWordRemove {

	public static void main(String[] args) {
		
		String str = "My name is is Bikesh rai rai";
		String[] split = str.split(" ");
		Set<String> hashset = new LinkedHashSet<String>();
		for(int i=0;i<=split.length-1;i++)
		{
			hashset.add(split[i]);
		}
        Iterator itr = hashset.iterator();
        while(itr.hasNext())
        {
        	System.out.print(itr.next()+ " ");
        }
	}

}
