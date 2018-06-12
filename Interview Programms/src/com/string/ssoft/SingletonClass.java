package com.string.ssoft;

public class SingletonClass {

	private static  SingletonClass mySingleton ;
	
	static {
		mySingleton = new SingletonClass();
		System.out.println("static block -1 ");
	}
		
	public SingletonClass() {
	 System.out.println("0-param private constructor ..");	
	}
	
	public static synchronized SingletonClass getInstance() {
		System.out.println("return the Object of the Singleton class ..");
		return mySingleton;
	}
	
	public static void testSingleton() {
		System.out.println("This is a Singleton Class ");
	}
	public static void main(String[] args) {
	//	SingletonClass sc = new SingletonClass();
	    testSingleton();
		System.out.println("=================================");
        testSingleton();

	/*	System.out.println("=================================");
		sc.testSingleton();
*/
	}

}
