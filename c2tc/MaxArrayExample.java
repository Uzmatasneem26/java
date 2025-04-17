package com.tnsif.array;


public class MaxArrayExample {
	public static void main(String args[]) {
		int []arr = {10,20,5,30,15};
		int max=0;
		for (int i=0;i<arr.length;i++) {
			
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max value is:"+max);
	}
}

