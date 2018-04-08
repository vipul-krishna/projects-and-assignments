package com.neu.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="customer_table")
@PrimaryKeyJoinColumn(name="personID")
public class Customer extends Person{
	
	@Column(name="emailId")
	private String emailId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	//@OneToMany(fetch=FetchType.LAZY, mappedBy="customer")
	//private Order order;
	//private Set<Order> orderSet = new HashSet<Order>();
	
	
	//private Order order; One customer will have many orders
	
	public Customer(){
		
	}
	
	public Customer(String emailId, String password, String phoneNumber){
		
		this.emailId = emailId;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}
	
	
	
}
