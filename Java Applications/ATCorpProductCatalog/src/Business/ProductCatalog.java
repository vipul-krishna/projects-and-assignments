/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ProductCatalog {
    
    
    private ArrayList<Product> productCatalog;
    
    public ProductCatalog(){
        
         productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ArrayList<Product> productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    public Product addProduct(){
        Product product = new Product();
        productCatalog.add(product);
        return product;
    }
    
    public void deleteProduct(Product product)
    {
        productCatalog.remove(product);
    }
    
   public Product searchByName(String name){
       for(Product product : productCatalog){
           if(product.getProductName().equalsIgnoreCase(name)){
               return product;
           }
       }
       return null;
   }
   
   public Product searchByProductID(String prodID){
       for(Product product : productCatalog){
           if(String.valueOf(product.getProductID()).equals(prodID)){
               return product;
           }
       }
       return null;
   }
}
