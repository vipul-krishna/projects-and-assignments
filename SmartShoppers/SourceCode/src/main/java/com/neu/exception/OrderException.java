package com.neu.exception;

public class OrderException extends Exception{

	public OrderException(String message)
	{
		super("ProductException-"+ message);
	}
	
	public OrderException(String message, Throwable cause)
	{
		super("ProductException-"+ message,cause);
	}

}
