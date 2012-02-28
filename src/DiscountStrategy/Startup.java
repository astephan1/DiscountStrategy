/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategy;

/**
 *
 * @author astephan1
 */
public class Startup {

    /**
     *
     * 
     * 
     * I realise that this is incomplete, but I'm hoping that partial credit is possible.
     * 
     * 
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        cr.startNewSale("0001");
        cr.addProduct("I1000", 2);
        cr.addProduct("I1001", 4);
        cr.addProduct("I1002", 6);
        cr.finalizeSale();
    }
    
}