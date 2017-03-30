/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Lenovo
 */
public class Product {
    
    private String productType;
    private String productName;
    private int productID;
    private String vendorName;
    private String productDescription;
    private float basePrice;
    private float floorPrice;
    private float ceilingPrice;
    private String productBenefits;
    

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public float getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(float floorPrice) {
        this.floorPrice = floorPrice;
    }

    public float getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(float ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public String getProductBenefits() {
        return productBenefits;
    }

    public void setProductBenefits(String productBenefits) {
        this.productBenefits = productBenefits;
    }
    
            
   @Override
   public String toString(){
       return this.vendorName;
   }
}
