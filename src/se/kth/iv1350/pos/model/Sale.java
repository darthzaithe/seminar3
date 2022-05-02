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


    public Sale(){

    }

    private void setTimeOfSale(){
        timeOfSale = LocalDateTime.now();
    }

    private double getChange(Payment payment, double priceTotal){
        return payment.amountPaid - priceTotal;
    }

    private void addItem(ItemDTO item){

    }
}
