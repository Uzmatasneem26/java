package com.tns2;
import java.util.*;
public class Bookingtickets {
	 private static int totalTickets;
	 
	   void bookTickets() {
	        System.out.print("Enter your name: ");
	        Scanner sc = new Scanner(System.in);
	        String name = sc.next();

	        System.out.print("Enter number of tickets to book: ");
	        int numTickets = sc.nextInt();

	        if (numTickets <= totalTickets) {
	            totalTickets -= numTickets;
	            System.out.println(name + " has booked " + numTickets + " tickets.");
	            System.out.println("Remaining tickets: " + totalTickets);
	        } else {
	            System.out.println("not Available");
	        }
	    }
	     void checkAvailableTickets() {
	        System.out.println("Available tickets: " + totalTickets);
	    }
	}

