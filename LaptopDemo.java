package com.tnsif.collectionspackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopDemo {
	public static void main(String[] args) {
		List<Laptop> laps=new ArrayList<Laptop>();
		laps.add(new Laptop("dell",15,16999));
		laps.add(new Laptop ("asus",12,17787));
		laps.add(new Laptop("apple",2,177070));
	Collections.sort(laps);
	for(Laptop l:laps) {
		System.out.println(l);
	}
		
		}
	}


