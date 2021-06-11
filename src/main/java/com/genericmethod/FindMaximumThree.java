package com.genericmethod;

public class FindMaximumThree {
			
	public static <T extends Comparable<T>> T max(T... elements) { // T is for Comparing the Maximum Integers
	    T max = elements[0];
	    for (T element : elements) {
	        if (element.compareTo(max) > 0) {
	            max = element; // Maximum Integer in the given three elements
	        }
	    }
	    return max; // returning of the results
	}
	
	// Printing of max Integers of given Three elements as a Output
	public static void main(String[] args) {
	       System.out.println("Integer Max: " + max(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89)));
	       System.out.println("Double Max: " + max(Double.valueOf(5.6), Double.valueOf(7.8), Double.valueOf(2.9)));
	       System.out.println("String Max: " + max("Apple", "Peach", "Banana"));
	       
	}
}
	
