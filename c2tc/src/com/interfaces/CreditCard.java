package com.tnsif.interfaces;

public class CreditCard implements Payment {
	private String cardNo;

	public CreditCard (String cardNo) {
		super();
		this.cardNo=cardNo;
	}

	@Override
	public void process(double amt) {
		System.out.println("processing credit crad payemnt of Rs" + amt + " using card no " +cardNo);
		// TODO Auto-generated method stub
		
	}
	
}
