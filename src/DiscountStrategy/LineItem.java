/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategy;

/**
 *
 * @author astephan1
 */
public class LineItem {
    
    private String productID;
    private int qty;
    private float productPrice;
    private String productDescription;
    private int discountStrategy;
    private float subTotal;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(int discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }
    
}