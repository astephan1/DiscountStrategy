/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategy;

/**
 *
 * @author astephan1
 */
public class CashRegister {
    
    private String customerNo;
    private String productID;
    private int qty;
    
    public void startNewSale(String customerNo) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void addProduct(String productID, int qty) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void finalizeSale() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

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
    
}