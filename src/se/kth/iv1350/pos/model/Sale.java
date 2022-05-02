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
        timeOfSale = LocalDateTime.now();
    }

    private void addItem(ItemDTO item)
}
