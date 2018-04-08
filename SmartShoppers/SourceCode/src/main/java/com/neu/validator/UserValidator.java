package com.neu.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.neu.dao.UserDAO;
import com.neu.exception.UserException;
import com.neu.pojo.Customer;
import com.neu.pojo.Vendor;

public class UserValidator implements Validator {
	public boolean supports(Class aClass) {
		return aClass.equals(Customer.class);
	}

	public void validate(Object obj, Errors errors) {
		Customer customer = (Customer) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "error.invalid.user", "First Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.invalid.user", "Last Name Required");
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.invalid.user", "User Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.password", "Password Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId", "error.invalid.emailId",
				"Email Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "error.invalid.phoneNumber", "Phone Number Required");
		
	
		// check if user exists
		
		if (errors.hasErrors()) {
            return;//Skip the rest of the validation rules
        }
        
		try {
			System.out.println("entered email: "+ customer.getEmailId());
			UserDAO userDao = new UserDAO();
			Customer c = userDao.uniqueCustomer(customer.getEmailId());
			if(c != null){
				errors.rejectValue("emailId", "error.invalid.emailId", "Email Id Already Exists. Please choose a new Email Id");
				return;
			}
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String pattern = "(?=.*[^ ])[a-zA-Z0-9 ]+" ;
		if(!customer.getFirstName().matches(pattern)){
			errors.rejectValue("firstName", "error.invalid.firstName", "Only Alphanumeric Values Allowed");
			return;
		}
		if(!customer.getLastName().matches(pattern)){
			errors.rejectValue("lastName", "error.invalid.lastName", "Only Alphanumeric Values Allowed");
			return;
		}
		if(!customer.getPassword().matches(pattern)){
			errors.rejectValue("password", "error.invalid.password", "Only Alphanumeric Values Allowed");
			return;
		}
		
		String phonePattern = "\\d{3}-\\d{7}";
		if(!customer.getPhoneNumber().matches(phonePattern)){
			errors.rejectValue("phoneNumber", "error.invalid.phoneNumber", "Correct Pattern: xxx-xxxxxxx");
			return;
		}
		
		String emailpattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		if(!customer.getEmailId().matches(emailpattern)){
			errors.rejectValue("emailId", "error.invalid.emailId", "Invalid Email ID");
			return;
		}
		
	}
}
