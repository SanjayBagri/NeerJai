package com.string.innoEye;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseArrayTest {
	public static void main(String[] args) {
		String []array = {"Sanjay","Bagri","Neerjai","Urmilla"};
		
		System.out.println("Original Array Collection ::"+Arrays.toString(array));
		
		List<String> productList=Arrays.asList(array);
		Collections.reverse(productList);
		String [] reverseArray =productList.toArray(array);
		System.out.println("Reverse ordered Collection  :"+Arrays.toString(reverseArray));
		//
	}
}
