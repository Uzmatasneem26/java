package com.tnsif.collectionspackage;
import java .util.ArrayList;
import java.util.Collections;
import java.util.List;
;public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer> List =new ArrayList();
         System.out.println("the size of the array list"+List.isEmpty());
         System.out.println("the size of the array list"+List.size());
         List.add(2);
         List.add(4);
         List.add(null);
        
         System.out.println("the size of the array list"+List.size());
        
         System.out.println("the size of the array list"+List.size());
         System.out.println(List);
         
		System.out.println("is character present in arraylist" + List.contains('b'));
		 System.out.println("is the number 2 present in the arraylist" + List.contains(2));
;		 List.remove(2);
		Collections.sort(List);
		
		 
		 System.out.println(List);
		 System.out.println("the integer at index 0 is "+ List.get(0));
	}

}
