package com.interview.exception;

public class ArraySortWithoutThirdVariable {

	public static void main(String[] args) {
		
		        int[] arr = {29, 10, 14, 37, 13};

		        System.out.println("Array before sorting:");
		        printArray(arr);

		        // Bubble Sort without using XOR or a third variable
		        for (int i = 0; i < arr.length - 1; i++) {
		            for (int j = 0; j < arr.length - i - 1; j++) {
		                if (arr[j] > arr[j + 1]) {
		                    // Swap elements without using XOR or a third variable
		                    arr[j] = arr[j] + arr[j + 1];
		                    arr[j + 1] = arr[j] - arr[j + 1];
		                    arr[j] = arr[j] - arr[j + 1];
		                }
		            }
		        }

		        System.out.println("Array after sorting:");
		        printArray(arr);
		    }

		    public static void printArray(int[] arr) {
		        for (int value : arr) {
		            System.out.print(value + " ");
		        }
		        System.out.println();
		    }

	-

}
