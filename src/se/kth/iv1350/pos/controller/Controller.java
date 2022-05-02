package se.kth.iv1350.pos.controller;

import se.kth.iv1350.pos.model.Sale;

/**
 * Controller
 */
public class Controller {

    /**
     * Controller constructor
     */
    public Controller(){

    }

    public void initiateProgram(){

    }

    /**
     * Initiates a new Sale
     */
    public void makeNewSale(){

        Sale sale = new Sale();
    }

    public void enterItem(int itemId, int quantity, Sale sale){
        sale.registerItem(itemId, quantity);
    }

    public void endSale(){

    }

}
