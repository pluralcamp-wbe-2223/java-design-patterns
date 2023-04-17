package com.pluralcamp.solid.lsp.dont;

public class Main {

	public static void main(String[] args) {
		System.out.println("*** Demo without LSP ***\n");

		PaymentsHelper helper = new PaymentsHelper();
		
		//Instantiating two registered users payments
		RegisteredUserPayment annaPayment = 
				new RegisteredUserPayment("Anna");
		RegisteredUserPayment josephPayment = 
				new RegisteredUserPayment("Joseph");
		
		//Instantiating a guest user payment
		GuestUserPayment guestUserPayment = new GuestUserPayment();
		
		//Adding users payments to the helper
		helper.addUserPayment(annaPayment);
		helper.addUserPayment(josephPayment);
		helper.addUserPayment(guestUserPayment);
		
		//Processing the payments using the helper
		helper.showPreviousPayments(); //will throw error for guest user!!!
		
		helper.processNewPayments();		
	}
}
