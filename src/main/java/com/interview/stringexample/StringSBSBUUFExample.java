package com.interview.stringexample;

public class StringSBSBUUFExample {
/*
 * Detailed Explanation
 *  String Immutable: Once a String object is created, it
 * cannot be changed. Any modification results in the creation of a new String
 * object. Thread Safety: Because strings are immutable, they are inherently
 * thread-safe and can be shared between threads without synchronization. Usage:
 * Best used when the string value will not change often, such as configuration
 * keys or constants. 
 * 
 * StringBuffer Mutable: 
 * Allows modification of the string
 * content without creating new objects. Thread Safety: Methods are
 * synchronized, making it thread-safe. Suitable for use in a multi-threaded
 * environment where multiple threads might modify the same string. Performance:
 * Slower than StringBuilder due to synchronization overhead but faster than
 * String for frequent modifications. Usage: Best used in a multi-threaded
 * environment where thread safety is required. StringBuilder Mutable: Similar
 * to 
 * StringBuffer, it allows modifications to the string content without
 * creating new objects. Thread Safety: Methods are not synchronized, making it
 * not thread-safe. Suitable for use in a single-threaded environment or where
 * thread safety is not a concern. Performance: Faster than StringBuffer due to
 * the absence of synchronization overhead. Usage: Best used in a
 * single-threaded environment or when thread safety is not an issue, such as in
 * local variables or method calls.
 * 
 * 
 **/
	public static void main(String[] args) {
		  // String example
        String s1 = "Hello";
        String s2 = s1 + " World";
        System.out.println(s2); // Outputs: Hello World

        // StringBuffer example
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" World");
        System.out.println(sb1.toString()); // Outputs: Hello World

        // StringBuilder example
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println(sb2.toString()); // Outputs: Hello World
	}

}
