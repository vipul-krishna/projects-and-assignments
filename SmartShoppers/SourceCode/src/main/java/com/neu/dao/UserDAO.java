package com.neu.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;


import com.neu.exception.UserException;

import com.neu.pojo.Customer;
import com.neu.pojo.Vendor;


public class UserDAO extends DAO {

	public UserDAO() {
	}


	public Customer get(String emailId, String password) throws UserException {
		try {
			begin();
			Query q = getSession().createQuery("from Customer where emailId = :emailId and password = :password");
			q.setString("emailId", emailId);
			q.setString("password", password);			
			Customer customer = (Customer) q.uniqueResult();
			commit();
			close();
			return customer;
		} catch (HibernateException e) {
			rollback();
			throw new UserException("Could not get user with email ID:  " + emailId, e);
		}
	}
	
	
	
	
	public Customer uniqueCustomer(String emailId) throws UserException {
		try {
			begin();
			Query q = getSession().createQuery("from Customer where emailId = :emailId");
			q.setString("emailId", emailId);
			//q.setString("password", password);			
			Customer customer = (Customer) q.uniqueResult();
			commit();
			close();
			return customer;
		} catch (HibernateException e) {
			rollback();
			throw new UserException("Could not get user with email ID:  " + emailId, e);
		}
	}
	
	
	
	public Customer register(Customer c)
			throws UserException {
		try {
			begin();
			System.out.println("inside DAO");

			
			//User user = new User(u.getUsername(), u.getPassword());
			
			Customer customer  =  new Customer(c.getEmailId(), c.getPassword(), c.getPhoneNumber());

			customer.setFirstName(c.getFirstName());
			customer.setLastName(c.getLastName());
			
			getSession().save(customer);
			commit();
			return customer;

		} catch (HibernateException e) {
			rollback();
			throw new UserException("Exception while creating user: " + e.getMessage());
		}
	}
	
	///////////////////////////////////////Vendor Methods///////////////////////////////////////////////////
	
	
	public Vendor registerVendor(String fName, String lName, String email, String password, String company) throws UserException{
		
		try{
			
		begin();
		Vendor vendor  = new Vendor(company,email,password);
		vendor.setFirstName(fName);
		vendor.setLastName(lName);
		getSession().save(vendor);
		commit();
		
		return vendor;
		
		} catch (HibernateException e) {
			rollback();
			return null;
		}
	}
	
	public Vendor loginVendor(String email, String password){
		
		try{
			begin();
			Query q = getSession().createQuery("from Vendor where emailId = :emailId and password = :password");
			q.setString("emailId", email);
			q.setString("password", password);			
			Vendor vendor = (Vendor) q.uniqueResult();
			commit();
			close();
			return vendor;

			
		}catch (HibernateException e) {
			rollback();
			return null;
		}
		
	}
	
	public Vendor uniqueVendor(String emailId) throws UserException {
		try {
			begin();
			Query q = getSession().createQuery("from Vendor where emailId = :emailId");
			q.setString("emailId", emailId);			
			Vendor vendor = (Vendor) q.uniqueResult();
			commit();
			close();
			return vendor;
		} catch (HibernateException e) {
			rollback();
			throw new UserException("Could not get user with email ID:  " + emailId, e);
		}
	}
}










