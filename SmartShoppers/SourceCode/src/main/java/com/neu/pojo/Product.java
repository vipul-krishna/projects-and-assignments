package com.neu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Entity
@Table(name="product_table")
public class Product {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="productID",unique=true,nullable=false)
	private long productID;
	
	@Column(name="productBrand")
	private String productBrand;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="productDescription")
	private String productDescription;
	
	@Column(name="avlQuantity")
	private int avlQuantity;
	
	@Column(name="price")
	private float price;
	
	@Column(name="filePath")
	private String filePath;
	
	@Column(name="fileAccessName")
	private String fileAccessName;
	
	@Transient
	private CommonsMultipartFile photo;
	
	@ManyToOne
	private Vendor vendor;
	
	public Product(){
		
	}
	
	public Product(String productBrand, String productName, String productDescription, int avlQuantity,
			float price, Vendor vendor){
		
		this.productBrand = productBrand;
		this.productName = productName;
		this.productDescription = productDescription;
		this.avlQuantity = avlQuantity;
		this.price = price;
		this.vendor = vendor;
		
	}

	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getAvlQuantity() {
		return avlQuantity;
	}

	public void setAvlQuantity(int avlQuantity) {
		this.avlQuantity = avlQuantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public CommonsMultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(CommonsMultipartFile photo) {
		this.photo = photo;
	}

	public String getFileAccessName() {
		return fileAccessName;
	}

	public void setFileAccessName(String fileAccessName) {
		this.fileAccessName = fileAccessName;
	}
	
	
	
}
