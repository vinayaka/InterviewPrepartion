package com.interview.stringexample;

public class StringExample {

	public static void main(String[] args) {

		/*
		 * String Literals (String s1 = "Hello";): Utilize the string pool for memory
		 * efficiency. If the string already exists in the pool, it reuses the
		 * reference. new Keyword (String s2 = new String("Hello");): Creates a new
		 * string object in the heap, independent of the string pool, which results in
		 * separate memory allocation and different object references. Interning (String
		 * s2 = new String("Hello").intern();): Adds the string to the pool if it
		 * doesn't exist and returns the reference from the pool, aligning it with
		 * string literal behavior. Understanding these differences helps in managing
		 * memory and optimizing performance in Java applications.
		 */

		String s1 = "Hello";
		String s2 = new String("Hello");

		System.out.println(s1 == s2); // Outputs: false
		System.out.println(s1.equals(s2)); // Outputs: true

	}

}
