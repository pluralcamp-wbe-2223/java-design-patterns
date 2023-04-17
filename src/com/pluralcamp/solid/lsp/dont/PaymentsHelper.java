package com.pluralcamp.solid.lsp.dont;

import java.util.ArrayList;
import java.util.List;

public class PaymentsHelper {
	
	List<Payment> payments = new ArrayList<>();
	
	public void addUserPayment(Payment userPayment) {
		payments.add(userPayment);
	}
	
	public void showPreviousPayments() {
		for(Payment payment: payments) {
			payment.previousPaymentInfo();
			System.out.println("------------");
		}
	}
	
	public void processNewPayments() {
		for(Payment payment: payments) {
			payment.newPayment();
			System.out.println("--------");
		}		
	}
}
