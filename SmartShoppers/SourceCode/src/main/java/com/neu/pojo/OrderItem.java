package com.neu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderitemtable")
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="itemID",unique=true, nullable=false)
	private long itemID;
	
	@Column(name="itemBrand")
	private String itemBrand;
	
	@Column(name="itemName")
	private String itemName;
	
	@Column(name="itemPrice")
	private float itemPrice;
	
	@Column(name="itemDescription")
	private String itemDescription;
	
	@Column(name="purchaseQuantity")
	private int purchaseQuantity; 
	
	@ManyToOne
	@JoinColumn(name="orderId")
	private Order order;

	public OrderItem(){
		
	}
	
	public OrderItem(String itemBrand, String itemName, float itemPrice, String itemDescription,
			int purchaseQuantity, Order order){
		
	}

	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public long getItemID() {
		return itemID;
	}


	public void setItemID(long itemID) {
		this.itemID = itemID;
	}


	public String getItemBrand() {
		return itemBrand;
	}

	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getPurchaseQuantity() {
		return purchaseQuantity;
	}

	public void setPurchaseQuantity(int purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}
	
	

}
