/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategy;

/**
 *
 * @author astephan1
 */
public class Product {
    
    private float unitCost;
    private int discountStrategy;

    public int getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(int discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(float unitCost) {
        this.unitCost = unitCost;
    }
    
}