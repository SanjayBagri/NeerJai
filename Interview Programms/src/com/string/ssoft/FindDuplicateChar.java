package com.string.ssoft;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateChar {

	public static void findDuplicateChar(String str) {
		Map<Character,Integer> dupMap = new HashMap<Character,Integer>();
		
		char [] charArr = str.toCharArray();
		System.out.println(" smoe value char :: "+charArr);
		
		for(char value : charArr) {
			System.out.println(" smoe value :: "+value);
			if(Character.isAlphabetic(value)) {
				if(dupMap.containsKey(value)) {
				System.out.println(" smoe value of if :: "+Character.isAlphabetic(value));
				dupMap.put(value, dupMap.get(value)+1);
				}
			else {
				dupMap.put(value, 1);
			}
		  }
		}
		System.out.println(dupMap);
	
	}
	
	
	public static void main(String[] args) {

		FindDuplicateChar.findDuplicateChar("ssbbjabycz kl man oop");
		
	}

}
