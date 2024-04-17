package com.vw.pizza.exception;

public class CustomerNotFound extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6146525622640649697L;

	public CustomerNotFound(String message)
	{
		super(message);
	}
}
