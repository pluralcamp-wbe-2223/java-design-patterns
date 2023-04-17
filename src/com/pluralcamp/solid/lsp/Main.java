package com.pluralcamp.solid.lsp;

public class Main {

	public static void main(String[] args) {
		System.out.println("*** Demo that follows the LSP ***\n");

		PaymentsHelper helper = new PaymentsHelper();
		
		//Instantiating two registered users payments
		RegisteredUserPayment annaPayment = 
				new RegisteredUserPayment("Anna");
		RegisteredUserPayment josephPayment = 
				new RegisteredUserPayment("Joseph");
		
		//Instantiating a guest user payment
		GuestUserPayment guestUserPayment = new GuestUserPayment();
		
		//Adding previous payments to the helper
		helper.addPreviousPayment(annaPayment);
		helper.addPreviousPayment(josephPayment);
		
		//Adding new payments to the helper
		helper.addNewPayment(annaPayment);
		helper.addNewPayment(josephPayment);
		helper.addNewPayment(guestUserPayment);
		
		//Processing the payments using the helper
		helper.showPreviousPayments(); 
		helper.processNewPayments();		
	}
}
