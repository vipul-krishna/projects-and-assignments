package com.neu.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="ordertable")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="orderId",unique=true, nullable=false)
	private long orderId;
	
	
	//@OneToMany(fetch=FetchType.LAZY, mappedBy="order")
	//private Set<OrderItem> orderDetails = new HashSet<OrderItem>();

	@Column(name="orderTotalValue")
	private float orderTotalValue;
	
	@Column(name="buyerName")
	private String buyerName;
	
	@Column(name="buyerEmail")
	private String buyerEmail;
	
	@Column(name="buyerPhone")
	private String buyerPhone;
	
	@Column(name="deliveryAddress1")
	private String deliveryAddress1;
	
	@Column(name="deliveryAddress2")
	private String deliveryAddress2;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="deliveryDate")
	private String deliveryDate;
	
	@Column(name="cardnumber")
	private long cardnumber;
	
	@Column(name="expmonth")
	private String expmonth;
	
	@Column(name="expyear")
	private String expyear;
	
	@Column(name="cvv")
	private int cvv;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="personID")
	private Customer customer;
	
	public Order(){
		
	}
	public long getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getExpmonth() {
		return expmonth;
	}

	public void setExpmonth(String expmonth) {
		this.expmonth = expmonth;
	}

	public String getExpyear() {
		return expyear;
	}

	public void setExpyear(String expyear) {
		this.expyear = expyear;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public float getOrderTotalValue() {
		return orderTotalValue;
	}
	public void setOrderTotalValue(float orderTotalValue) {
		this.orderTotalValue = orderTotalValue;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

//	public Set<OrderItem> getOrderDetails() {
//		return orderDetails;
//	}
//
//	public void setOrderDetails(Set<OrderItem> orderDetails) {
//		this.orderDetails = orderDetails;
//	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public String getBuyerPhone() {
		return buyerPhone;
	}

	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	public String getDeliveryAddress1() {
		return deliveryAddress1;
	}

	public void setDeliveryAddress1(String deliveryAddress1) {
		this.deliveryAddress1 = deliveryAddress1;
	}

	public String getDeliveryAddress2() {
		return deliveryAddress2;
	}

	public void setDeliveryAddress2(String deliveryAddress2) {
		this.deliveryAddress2 = deliveryAddress2;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
}
