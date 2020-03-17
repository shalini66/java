package com.capgemini.javafullstack.exception;

public class Paytm {
	void book() {
		System.out.println("Book Started");

		IRCTC i = new IRCTC();
		try {
			i.confirm();
		} catch(ArithmeticException e) {
			System.out.println("Exception Caught at book()");
			throw e;
		} finally {
			System.out.println("Book Ended");
		}
	}
}
