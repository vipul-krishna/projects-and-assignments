package com.neu.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.neu.dao.UserDAO;
import com.neu.exception.UserException;
import com.neu.pojo.Vendor;

public class VendorValidator implements Validator{
	
//	@Autowired
//	@Qualifier("userDao")
//	UserDAO userDao;
	
	public boolean supports(Class aClass) {
		return aClass.equals(Vendor.class);
	}

	public void validate(Object obj, Errors errors) {
		Vendor vendor = (Vendor) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "error.invalid.user", "First Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.invalid.user", "Last Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.password", "Password Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId", "error.invalid.emailId",
				"Email Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyName", "error.invalid.companyName", "Company Name Required");
		
		// check if user exists
		
		if (errors.hasErrors()) {
            return;//Skip the rest of the validation rules
        }
        
		try {
			System.out.println("entered email: "+ vendor.getEmailId());
			UserDAO userDao = new UserDAO();
			Vendor v = userDao.uniqueVendor(vendor.getEmailId());
			if(v != null){
				errors.rejectValue("emailId", "error.invalid.emailId", "Email Id Already Exists. Please choose a new Email Id");
				return;
			}
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		if(vendor.getFirstName().contains("<")){
//			errors.rejectValue("firstName", "error.invalid.firstName", "Do not Use Special Characters");
//		}
		
		String pattern = "(?=.*[^ ])[a-zA-Z0-9 ]+" ;
		if(!vendor.getFirstName().matches(pattern)){
			errors.rejectValue("firstName", "error.invalid.firstName", "Only Alphanumeric Values Allowed");
			return;
		}
		if(!vendor.getLastName().matches(pattern)){
			errors.rejectValue("lastName", "error.invalid.lastName", "Only Alphanumeric Values Allowed");
			return;
		}
		if(!vendor.getPassword().matches(pattern)){
			errors.rejectValue("password", "error.invalid.password", "Only Alphanumeric Values Allowed");
			return;
		}
		if(!vendor.getCompanyName().matches(pattern)){
			errors.rejectValue("companyName", "error.invalid.companyName", "Only Alphanumeric Values Allowed");
			return;
		}
		
		String emailpattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		if(!vendor.getEmailId().matches(emailpattern)){
			errors.rejectValue("emailId", "error.invalid.emailId", "Invalid Email ID");
			return;
		}
		
		
		
	}
}
