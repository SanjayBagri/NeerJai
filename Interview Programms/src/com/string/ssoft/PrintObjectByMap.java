package com.string.ssoft;

import java.util.HashMap;
import java.util.Map;

public class PrintObjectByMap {

	public static void main(String[] args) {

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("1", "Hi");
		map.put("2", "Hello");
		map.put("3", "Bagri");

		map.put("1", "Sanjay");
		map.put("2", "Bagri");
		map.put("-", "NeerJai");
		map.put("@", "jai");
		map.put("", "neer");
		map.put("", "mahi");


		// System.out.println(" added Map Object in collection 1:: " +map.get(map));
		System.out.println(" added Map Object in collection 2::  " + map.size());
		System.out.println(" added Map Object in collection 3::  " + map);
	}
}
