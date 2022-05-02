package se.kth.iv1350.pos.model;

import se.kth.iv1350.pos.integration.ItemDTO;

import java.time.LocalDateTime;

/**
 * Represents one discrete sale.
 * Contains information about that sale and logic to perform a sale.
 */

public class Sale {
    private LocalDateTime timeOfSale;
    private double priceTotal;

    /**
     * Constructor for Sale
     */
    public Sale(){

    }

    public LocalDateTime getTimeOfSale(){
        return LocalDateTime.now();
    }

    public void registerItem(int itemId, int quantity){

    }

    /**
     * Gets the change to return to the customer.
     * @param payment Is the amount paid by the customer
     * @param priceTotal Is the total price of the sale
     * @return Gives the difference between the amount paid and the price
     */

    private double getChange(Payment payment, double priceTotal){
        return payment.amountPaid - priceTotal;
    }

    /**
     * Adds an item to the current sale
     * @param itemID the item id number
     */

    private void addItem(int itemID){

    }
}
