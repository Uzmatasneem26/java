package com.tnsif.demo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main method with String array arguments");
        main(10); 
        main("good");
    }

    public static void main(int num) {
        System.out.println("Main method with integer argument: " + num);
    }

    public static void main(String str1) {
         System.out.println("Main method with two String arguments: " + str1);
    }
}