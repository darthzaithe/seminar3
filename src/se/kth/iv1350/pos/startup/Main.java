package se.kth.iv1350.pos.startup;

import se.kth.iv1350.pos.controller.Controller;
import se.kth.iv1350.pos.view.View;

public class Main {

    /**
     * Main method
     * Executes the main program
     * @param args Takes no command line parameters
     */
    public static void main(String[] args) {
        Controller control = new Controller();
        View view = new View();
    }
}
