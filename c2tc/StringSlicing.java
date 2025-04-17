package com.tnsif.Strings;
import java.util.Scanner;
public class StringSlicing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter a string ");
String text=sc.nextLine();


System.out.println("Enter start index ");
int start=sc.nextInt();


System.out.println("Enter end index ");
int end =sc.nextInt();

//validate and slice a string
if(start >= 0 && end <=text.length() && start<end) {
	String slice=text.substring(start,end);
	System.out.println("sliced string:"+slice);
	
}

	}

}
