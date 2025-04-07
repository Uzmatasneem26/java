package com.tnsif.interfaces;

public class PaymentDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment c=new CreditCard("a1234");
		Payment u=new UPI("s4567");
		
		PaymentServices ps=new PaymentServices();
		ps.makePayment(c,88);
		ps.makePayment(u,99);

	}

}
