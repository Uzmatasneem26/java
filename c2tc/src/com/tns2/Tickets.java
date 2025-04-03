package com.tns2;
import java.util.Scanner;

public class Tickets extends Bookingtickets {
	 
	   

	    public  void main(String[] args) {
	    	 Scanner sc = new Scanner(System.in);
	      
	        int totalTickets = 5; 

	        while (true) {
	            System.out.println("Ticket Booking System");
	            System.out.println("1. Book Tickets");
	            System.out.println("2. Check Available Tickets");
	         

	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    bookTickets();
	                    break;
	                case 2:
	                    checkAvailableTickets();
	                    break;
	              
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    
	    }
}
	 