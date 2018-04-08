package com.neu.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neu.validator.UserValidator;
import com.neu.validator.VendorValidator;
import com.neu.exception.UserException;
import com.neu.dao.UserDAO;
import com.neu.pojo.Customer;
import com.neu.pojo.Product;
import com.neu.pojo.Vendor;


@Controller
@RequestMapping("/user/*")
public class UserController {
	
	
	
	@Autowired
	@Qualifier("userDao")
	UserDAO userDao;
	
	@Autowired
	@Qualifier("userValidator")
	UserValidator userValidator;
	
	@Autowired
	@Qualifier("vendorValidator")
	VendorValidator vendorValidator;
	
	@InitBinder("customer")
	private void customerBinder(WebDataBinder binder) {
		binder.setValidator(userValidator);
	
	}
	
	@InitBinder("vendor")
	private void vendorBinder(WebDataBinder binder){
		binder.setValidator(vendorValidator);
	}
	
	

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	protected String goToUserHome(HttpServletRequest request) throws Exception {
		return "home";
	}
	
	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	protected ModelAndView loginUser(HttpServletRequest request) throws Exception {

		HttpSession session = (HttpSession) request.getSession();
		
		try {

			System.out.print("loginUser");
			String emailid = request.getParameter("emailid").replaceAll("<|>|;|,|=", "");
			String password = request.getParameter("password").replaceAll("<|>|;|,|=", "");

			Customer c = userDao.get(emailid, password);
			
			if(c == null){
				System.out.println("UserName/Password does not exist");
				session.setAttribute("errorMessage", "UserName/Password does not exist");
				return new ModelAndView("error");
			}
			
			 session.setAttribute("customer", c);
			 return new ModelAndView("home","customer",c);

		} catch (UserException e) {
			System.out.println("Exception: " + e.getMessage());
			session.setAttribute("errorMessage", "error while login");
			return new ModelAndView("error");
		}

	}
	
	@RequestMapping(value = "/user/register", method = RequestMethod.GET)
	protected ModelAndView registerUser() throws Exception {
		System.out.print("registerUser");

		return new ModelAndView("signup", "customer", new Customer());

	}
	
	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	protected ModelAndView registerNewUser(HttpServletRequest request,  @ModelAttribute("customer") Customer customer, BindingResult result) throws Exception {
		userValidator.validate(customer, result);

		if (result.hasErrors()) {
			return new ModelAndView("signup", "customer", customer);
		}
		try {

			System.out.print("registerNewUser");

			Customer c = userDao.register(customer);
			
			request.getSession().setAttribute("customer", c);
			
			return new ModelAndView("home", "customer", c);

		} catch (UserException e) {
			System.out.println("Exception: " + e.getMessage());
			return new ModelAndView("error", "errorMessage", "error while login");
		}
	
	}
	
////////////////////////////////VENDOR PAGE MAPPINGS//////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/user/vendorhome", method = RequestMethod.GET)
	protected ModelAndView vendorHome() throws Exception {
		System.out.print("Vendor Home Page");
		return new ModelAndView("vendorhome");

	}
	
	@RequestMapping(value = "/user/vendorsignup", method = RequestMethod.GET)
	protected ModelAndView vendorsignup() throws Exception {
		System.out.println("Vendor SignUp Page");

		return new ModelAndView("vendor-signup", "vendor", new Vendor());

	}
	
	@RequestMapping(value = "/user/vendorsignup", method = RequestMethod.POST)
	protected ModelAndView registerNewVendor(HttpServletRequest request,  @ModelAttribute("vendor") Vendor vendor, BindingResult result) throws Exception {
		System.out.println("Saving A New Vendor");
		
		vendorValidator.validate(vendor, result);
		if (result.hasErrors()) {
			return new ModelAndView("vendor-signup", "vendor", vendor);
		}
		
		try{
//		String firstName = request.getParameter("firstName");
//		String lastName = request.getParameter("lastName");
//		String email = request.getParameter("emailId");
//		String password = request.getParameter("password");
//		String companyName = request.getParameter("companyName");
			
		String firstName = vendor.getFirstName();
		String lastName = vendor.getLastName();
		String email = vendor.getEmailId();
		String password = vendor.getPassword();
		String companyName = vendor.getCompanyName();

		
		Vendor v = userDao.registerVendor(firstName, lastName, email, password, companyName);
		System.out.println("check1");
			if (v != null){
			request.getSession().setAttribute("vendor", v);
			System.out.println("check222222222222222");
			return new ModelAndView("vendor-action", "product", new Product());
			}
			else{
				System.out.println("Herreeeeeeeeee");
				return new ModelAndView("error");
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			return new ModelAndView("error");
		}

	}
	
	@RequestMapping(value = "/user/vendoraction", method = RequestMethod.POST)
	protected ModelAndView vendorlogin(HttpServletRequest request) throws Exception {
		System.out.println("Vendor signing in");
		
		
		String emailid = request.getParameter("emailid").replaceAll("<|>|;|,|=", "");
		String password = request.getParameter("password").replaceAll("<|>|;|,|=", "");
		
		Vendor v = userDao.loginVendor(emailid, password);
		if(v != null){
			
			request.getSession().setAttribute("vendor", v);
			return new ModelAndView("vendor-action", "product", new Product());
		}
		
		else{
			return new ModelAndView("error");
		}
	}
	
	@RequestMapping(value = "/user/logout", method = RequestMethod.GET)
	public String logoutUser(HttpServletRequest request){
		System.out.println("Entered Logout area");
		request.getSession().invalidate();
		return "redirect: /edu";
	}

}
