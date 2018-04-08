package com.neu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.neu.exception.OrderException;
import com.neu.pojo.Customer;
import com.neu.pojo.Order;
import com.neu.pojo.OrderItem;
import com.neu.pojo.Product;

public class OrderDAO extends DAO{
	
	private Order o =null;
	
	public OrderDAO(){
		
	}
	
	public Order orderDetails(long id) throws Exception{
		try{
		Query q = getSession().createQuery("from Order where orderId = :orderId");
		q.setLong("orderId", id);
		
		Order order = (Order)q.uniqueResult();
		return order;
		}catch (Exception e) {
			throw new OrderException("Exception while placing order: " + e.getMessage());
		}
	}
	
	public List<Product> searchProducts(String category) throws OrderException{
		
		Query q = getSession().createQuery("from Product");
		List<Product> productList = q.list();
		List<Product> filteredList = new ArrayList<Product>();
		
		for(Product product : productList){
			if(product.getProductDescription().contains(category)){
				filteredList.add(product);
			}
		}
		
		return filteredList;
	}
	private ArrayList<OrderItem> orderItemList  = new ArrayList<OrderItem>();
	public ArrayList<OrderItem> cartProcess(long id, int qty, Customer c){
		
		if(o==null){
			o = new Order();
		}
		//Order o = new Order();
		OrderItem oi = new OrderItem();
		Query q = getSession().createQuery("from Product");
		List<Product> productList = q.list();
		for(Product product:productList){
			if(product.getProductID()==id){
				oi.setItemBrand(product.getProductBrand());
				oi.setItemName(product.getProductName());
				oi.setItemDescription(product.getProductDescription());
				oi.setItemPrice(product.getPrice());
				oi.setPurchaseQuantity(qty);
				oi.setOrder(o);
				orderItemList.add(oi);
				
			}
		}
		return orderItemList;
	}
	
	public void saveOrder(Order order) throws OrderException{
		try {
			begin();
			System.out.println("DAO111111111111111111111");
			System.out.println("Saving order first....");

			getSession().save(order);
			System.out.println("DAO222");
			commit();
			
		} catch (HibernateException e) {
			rollback();
			System.out.println("DAO44444444444444");
			throw new OrderException("Exception while placing order: " + e.getMessage());
		}
	}
	
	public void orderSubmit(OrderItem oi) throws OrderException{
		try {
			begin();
			System.out.println("DAO111111111111111111111");
			System.out.println("inside ProductDAO");
			
//			System.out.println("****************************************");
//			System.out.println(order.getBuyerName());
//			System.out.println(order.getBuyerEmail());
//			
//			System.out.println(order.getCustomer().getFirstName());
//			
//			System.out.println(order.getDeliveryAddress1());
//			System.out.println(order.getCardnumber());
//			System.out.println("Order total"+order.getOrderTotalValue());
		
			//getSession().save(order);
			//commit();
			System.out.println("DAO222");
			getSession().save(oi);
			System.out.println("DAO33333333333333");
			commit();
			
		} catch (HibernateException e) {
			rollback();
			System.out.println("DAO44444444444444");
			throw new OrderException("Exception while placing order: " + e.getMessage());
		}
	}
	
	public List<Order> allOrderDetails(){
		Query q = getSession().createQuery("from Order");
		List<Order> productList = q.list();
		return productList;
	}

}
