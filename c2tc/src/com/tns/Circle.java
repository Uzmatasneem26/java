package com.tns;
import java.util.Scanner;

class Circle {
    
    double radius;
    String color;

  
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        radius = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter Color of Circle: ");
        color = sc.nextLine();
        sc.close(); 
    }

    
    void calcArea() {
        Double area = Math.PI * radius * radius;
        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
}
