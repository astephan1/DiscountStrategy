/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategy;

/**
 *
 * @author astephan1
 */
public class Customer {
    
    private String customerNo;
    private String customerName;
    
    public Customer(String cusNo, String cusName) {
        customerNo = cusNo;
        customerName = cusName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }
    
}