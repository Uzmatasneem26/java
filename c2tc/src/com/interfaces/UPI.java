package com.tnsif.interfaces;

public class UPI implements Payment{
	private String PayId;

	public UPI (String PayId) {
		super();
		this.PayId=PayId;
	}

	@Override
	public void process(double amt) {
		// TODO Auto-generated method stub
		System.out.println("processing credit crad payemnt of Rs" + amt + " using UPI no " + PayId);
	}
	
	

}
