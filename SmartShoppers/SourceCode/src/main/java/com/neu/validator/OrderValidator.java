package com.neu.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.neu.pojo.Order;

public class OrderValidator implements Validator {

	@Override
	public boolean supports(Class aClass) {
		return aClass.equals(Order.class);
	}
	@Override
	public void validate(Object obj, Errors errors) {
		Order product = (Order) obj;
		
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "error.invalid.user", "First Name Required");

	}

}
