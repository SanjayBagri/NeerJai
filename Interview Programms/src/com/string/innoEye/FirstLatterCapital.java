package com.string.innoEye;

//FirstlaterCapital project
import java.util.Scanner;
import java.util.StringTokenizer;

public class FirstLatterCapital {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the one line statement ::");
		String statement = sc.nextLine();

		String newStr = statement.trim();
		// String name = "my name is sanjay ";
		// capitalize(statement);
		// capitalizeString(name);

		capitalFirstlatter(newStr);
	}

	public static void capitalFirstlatter(String str) {
		System.out.println("new method "+str.length());
		
		String s = " " + str;
		
		System.out.println("Original Statement  ::" + s.length());
		if (s.equals("")) {
			System.out.println("Pease Enter Some Statement ..");
		} else {
			String cap ="";
			for (int i = 0; i < s.length(); i++) {

				char ch1 = s.charAt(i);
				if (ch1 == ' ') {
					cap += " ";
					char char1 = s.charAt(i + 1);
					cap += Character.toUpperCase(char1);
					i++;
				} else {
					cap += ch1;
				}
			}

			System.out.println("The new String with capital latter ::" + cap);

		}
	}

	public static String capitalize(String string) {
		System.out.println(string);
		StringTokenizer token = new StringTokenizer(string);
		String capsLine = "";

		while (token.hasMoreTokens()) {

			String first = token.nextToken().toString();
			capsLine += Character.toUpperCase(first.charAt(0)) + first.substring(1) + "";
		}

		return capsLine.substring(0, capsLine.length() - 1);
	}

	public static String capitalizeString(String string) {
		System.out.println("This is new  method ::" + string);
		char[] chars = string.toLowerCase().toCharArray();
		boolean found = false;
		for (int i = 0; i < chars.length; i++) {
			if (!found && Character.isLetter(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
				found = true;
			} else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '\'') { // You can add other
																									// chars here
				found = false;
			}
		}
		return String.valueOf(chars);
	}
}
