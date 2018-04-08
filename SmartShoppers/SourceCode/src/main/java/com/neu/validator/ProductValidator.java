package com.neu.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import com.neu.pojo.Product;
import com.neu.pojo.Vendor;


@Component

public class ProductValidator implements Validator{

	public boolean supports(Class aClass) {
		return aClass.equals(Product.class);
	}

	public void validate(Object obj, Errors errors) {
		
	
		Product product = (Product) obj;
		System.out.println("point3");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "productBrand", "error.invalid.productBrand", "Invalid Product Brand");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "productName", "error.invalid.productName", "Invalid Product Name");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "productDescription", "error.invalid.productDescription", "Invalid Description");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "avlQuantity", "error.invalid.avlQuantity","Invalid Quantity");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "error.invalid.price", "Invalid Price");
		//errors.rejectValue("price", "error.invalid.price", "Invalid Price");
		System.out.println("point4");
		
		
		//Regex Check:
		
		if (errors.hasErrors()) {
            return;//Skip the rest of the validation rules
        }
		
		String pattern = "(?=.*[^ ])[a-zA-Z0-9 ]+" ;
		if(!product.getProductName().matches(pattern)){
			errors.rejectValue("productName", "error.invalid.productName", "Only Alphanumeric Values Allowed");
			return;
		}
		if(!product.getProductDescription().matches(pattern)){
			errors.rejectValue("productDescription", "error.invalid.productDescription", "Only Alphanumeric Values Allowed");
			return;
		}
		
//		String price = String.valueOf(product.getPrice());
//		String pricePattern = "(\+|-)?([0-9]+(\.[0-9]+))";
//		if(!price.matches(pricePattern)){
//			errors.rejectValue("price", "error.invalid.price", "Enter Floating Point Values");
//			return;
//		}
		
	}

}
