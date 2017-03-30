package com.yusuf.spring.pojo;

public class Books {
	
	private long id;
	private String isbn;
	private String title;
	private String author;
	private float price;
	
	public Books(String isbn, String title, String author, float price){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	public Books(){
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	
}
