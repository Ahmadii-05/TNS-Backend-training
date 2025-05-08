package com.tnsif.exceptiondemo;

@SuppressWarnings("serial")
public class InvalidAmountException extends RuntimeException {
	    public InvalidAmountException(String message) {
	        super(message);
	    }

}
