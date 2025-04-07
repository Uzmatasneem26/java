package com.tnsif.interfaces;

public class PaymentServices {
	void makePayment (Payment pay,double amount)
	{
		pay.process(amount);
	}
}
