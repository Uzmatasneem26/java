package com.tnsif.Strings;

public class ReverseString {
	public static void main(String args[]) {
		String original ="hello";
		String reversed ="";
		
		for(int i =original.length()-1;i>=0;i--) {
			reversed+=original.charAt(i);
		}
		System.out.println("original string:" +original);
		System.out.println("reversed string :"+reversed);
		
		}
	}


