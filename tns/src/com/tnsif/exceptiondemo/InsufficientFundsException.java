package com.tnsif.exceptiondemo;

@SuppressWarnings("serial")
public class InsufficientFundsException extends RuntimeException {
	    public InsufficientFundsException(String message) {
	        super(message);
	    }
}
