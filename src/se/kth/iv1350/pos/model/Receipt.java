package se.kth.iv1350.pos.model;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

/**
 * Represents a receipt of the sale
 */
public class Receipt {
    private double totalPrice;
    private double taxRate;

    public Receipt() {
    }

    public void updateReceipt(){
    }

    public String createReceipt(Sale sale){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        LocalDateTime saleTime= sale.getTimeOfSale();
        StringBuilder stringBuilder = new StringBuilder();

        appendNewLine(stringBuilder, "Receipt");
        appendNewLine(stringBuilder, "The Store");
        appendNewLine(stringBuilder, "Adress");
        appendNewLine(stringBuilder, saleTime.toString());

        return stringBuilder.toString();


    }

    private void appendNewLine(StringBuilder stringBuilder, String newLine){
        stringBuilder.append(newLine);
        stringBuilder.append("\n");
    }
}
