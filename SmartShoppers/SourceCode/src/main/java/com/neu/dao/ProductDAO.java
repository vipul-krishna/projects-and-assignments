package com.neu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.neu.exception.ProductException;
import com.neu.pojo.Product;
import com.neu.pojo.Vendor;
public class ProductDAO extends DAO{
	
	public ProductDAO(){
		
	}
	
	public Product addNewProduct(Product p, Vendor v, String lp, String fileName) throws ProductException{
		
		try {
			begin();
			System.out.println("inside ProductDAO");

			Product product = new Product(p.getProductBrand(), p.getProductName(), p.getProductDescription(),
					p.getAvlQuantity(),p.getPrice(), v);
			product.setFilePath(lp);
			product.setFileAccessName(fileName);
			getSession().save(product);
			commit();
			
			return product;

		} catch (HibernateException e) {
			rollback();
			throw new ProductException("Exception while adding product: " + e.getMessage());
		}
	}
	
	public List<Product> fetchProductList(String brand) throws ProductException{
		
		Query q = getSession().createQuery("from Product");
		List<Product> productList = q.list();
		List<Product> filteredList = new ArrayList<Product>();

		for(Product product : productList){
			
			if(product.getProductBrand().equals(brand)){
				filteredList.add(product);
			}
		}
		
		return filteredList;
	}

}
