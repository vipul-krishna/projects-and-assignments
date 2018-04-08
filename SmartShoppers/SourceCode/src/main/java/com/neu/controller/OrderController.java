package com.neu.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.neu.dao.OrderDAO;
import com.neu.dao.ProductDAO;
import com.neu.exception.OrderException;
import com.neu.exception.ProductException;
import com.neu.pojo.Customer;
import com.neu.pojo.Order;
import com.neu.pojo.OrderItem;
import com.neu.pojo.Product;
import com.neu.validator.OrderValidator;
import com.neu.validator.ProductValidator;

@Controller
public class OrderController {
	
	@Autowired
	@Qualifier("orderDao")
	OrderDAO orderDao;
	
	@Autowired
	@Qualifier("orderValidator")
	OrderValidator orderValidator;
	
	@Autowired
	@Qualifier("mailSender")
	private MailSender mailSender;
	
	@InitBinder("order")
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(orderValidator);
	}
	
	@RequestMapping(value="/item/search.htm", method = RequestMethod.POST)
	public ModelAndView searchProduct(HttpServletRequest request){
		String searchWord = request.getParameter("category");
		
		try {
			
			ArrayList<Product> myPurchaseItemList = (ArrayList<Product>) orderDao.searchProducts(searchWord);
			request.getSession().setAttribute("myPurchaseItemList", myPurchaseItemList);
			return new ModelAndView("searchResults");
			
		} catch (OrderException e) {
			System.out.println("Exception: " + e.getMessage());
			return new ModelAndView("error", "errorMessage", "error while customer is searching items");
		}
	}
	
	@RequestMapping(value="/item/search.htm", method = RequestMethod.GET)
	public ModelAndView searchOrder(HttpServletRequest request){
		long orderId = Long.parseLong(request.getParameter("orderid"));
		System.out.println("Order Id Sent: "+orderId);
		
		
		try{
		Order order = orderDao.orderDetails(orderId);
		System.out.println("Customer Name: "+order.getBuyerName());
		return new ModelAndView("trackorder","order",order);
		}
		
		catch(Exception e1){
			return new ModelAndView("error");
		}
	}
	
	@RequestMapping(value="/item/cart.htm", method = RequestMethod.POST)
	public ModelAndView cart(HttpServletRequest request){
		
//		Customer c = (Customer)request.getSession().getAttribute("customer");
//		System.out.println(c.getFirstName());
//		long productID = Long.parseLong(request.getParameter("productID"));
//		System.out.println("Product Id is: "+productID);
//		String field  = "purchaseQty"+String.valueOf(productID);
//		int purchaseQty = Integer.parseInt(request.getParameter(field));
//		System.out.println("Purchase Qty passed: "+purchaseQty);
//		OrderItem item = orderDao.cartProcess(productID, purchaseQty, c);
//		Order order = item.getOrder();
//		
//		request.getSession().setAttribute("item", item);
		return new ModelAndView("cart");
	}
	
	
	@RequestMapping(value="/item/cartupdate.htm", method = RequestMethod.POST)
	public ModelAndView cartUpdate(HttpServletRequest request){
		Customer c = (Customer)request.getSession().getAttribute("customer");
		long productID = Long.parseLong(request.getParameter("productID"));
		String field  = "purchaseQty"+String.valueOf(productID);
		int purchaseQty = Integer.parseInt(request.getParameter(field));
		ArrayList<OrderItem> orderItemList = orderDao.cartProcess(productID, purchaseQty, c);
		for(OrderItem oi:orderItemList){
			System.out.println("Printing order items name: "+oi.getItemName());
			System.out.println("Printing order object:"+oi.getOrder());
		}
		request.getSession().setAttribute("orderItemList", orderItemList);
		return new ModelAndView("searchResults" );
	}
	
	
	@RequestMapping(value="/item/delivery.htm", method = RequestMethod.POST)
	public ModelAndView delivery(HttpServletRequest request){
		//return "delivery";
		float totalOrderWorth = 0;
		ArrayList<OrderItem> myList = (ArrayList<OrderItem>)request.getSession().getAttribute("orderItemList");
			for(OrderItem oi : myList){
			
			totalOrderWorth = totalOrderWorth+(oi.getPurchaseQuantity()*oi.getItemPrice());
			//order.setOrderTotalValue(total);
		}
		Order order = myList.get(0).getOrder();
		order.setOrderTotalValue(totalOrderWorth);
		
		return new ModelAndView("delivery");
	}
	
	
	@RequestMapping(value="/item/payment.htm", method = RequestMethod.POST)
	public String payment(HttpServletRequest request){
		ArrayList<OrderItem> myList = (ArrayList<OrderItem>)request.getSession().getAttribute("orderItemList");
//		for(OrderItem oi : myList){
			
		Order order = myList.get(0).getOrder();
		//OrderItem item = (OrderItem)request.getSession().getAttribute("item");
		//Order order = oi.getOrder();
		order.setBuyerName(request.getParameter("fullname"));
		order.setBuyerEmail(request.getParameter("email"));
		order.setBuyerPhone(request.getParameter("contact"));
		order.setDeliveryAddress1(request.getParameter("address1"));
		order.setDeliveryAddress2(request.getParameter("address2"));
		order.setZip(request.getParameter("zip"));
		order.setCity(request.getParameter("city"));
		order.setState(request.getParameter("state"));
		//break;
		//}
		
		return "payment";
	}
	
	@RequestMapping(value="/item/review.htm", method = RequestMethod.POST)
	public String review(HttpServletRequest request){
		
		ArrayList<OrderItem> myList = (ArrayList<OrderItem>)request.getSession().getAttribute("orderItemList");
		//for(OrderItem oi : myList){
			Order order = myList.get(0).getOrder();
			//OrderItem item = (OrderItem)request.getSession().getAttribute("item");
			//Order order = oi.getOrder();
			order.setCardnumber(Long.parseLong(request.getParameter("cardnumber")));
			order.setExpmonth(request.getParameter("expmonth"));
			order.setExpyear(request.getParameter("expyear"));
			order.setCvv(Integer.parseInt(request.getParameter("pin")));
			
			//float total = oi.getPurchaseQuantity()*oi.getItemPrice();
			//order.setOrderTotalValue(total);
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			order.setDeliveryDate(dateFormat.format(date));
			
			Customer customer = (Customer)request.getSession().getAttribute("customer");
			order.setCustomer(customer);
			//break;
		//}
		
		return "review";
	}
	
	@RequestMapping(value="/item/confirmation.htm", method = RequestMethod.POST)
	public ModelAndView confirmation(HttpServletRequest request){
		//return "confirmation";
		
	
		
		ArrayList<OrderItem> myList = (ArrayList<OrderItem>)request.getSession().getAttribute("orderItemList");
		//for(OrderItem oi : myList){
		
		Order order = myList.get(0).getOrder();
		
		try {
			orderDao.saveOrder(order);
			
			
			SimpleMailMessage email = new SimpleMailMessage();
			email.setTo(order.getBuyerEmail());
			email.setSubject("OrderDetails");
			email.setText("Hi"+" "+order.getCustomer().getFirstName()+". Thank You for shopping on SmartShoppers. "+
							"Your Order ID is: "+order.getOrderId());
			mailSender.send(email);
			
			
		} catch (OrderException e1) {
			System.out.println("Exception: " + e1.getMessage());
			return new ModelAndView("error", "errorMessage", "error while placing order");
		}
		
		
		for(OrderItem item:myList){
		//OrderItem item = (OrderItem)request.getSession().getAttribute("item");
		//Order order = item.getOrder();
		
		try {

			orderDao.orderSubmit(item);
			
		} catch (OrderException e) {
			System.out.println("Exception: " + e.getMessage());
			return new ModelAndView("error", "errorMessage", "error while placing order");
		}
		}
		return new ModelAndView("confirmation");
		//return new ModelAndView("error");
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value="/item/vieworders.htm", method = RequestMethod.POST)
	public ModelAndView viewAllOrders(HttpServletRequest request){
		
		ArrayList<Order> allOrderList = (ArrayList<Order>) orderDao.allOrderDetails();
		request.getSession().setAttribute("allOrderList", allOrderList);
		return new ModelAndView("allorders-admin");
	}
	
	
	
	
	
	
	

}
