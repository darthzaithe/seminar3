package se.kth.iv1350.pos.integration;

/**
 * Handled item data transfers
 */

public class ItemDTO {
    private final double PRICE;
    private final String ITEM_ID;
    private final double VAT_RATE;
    private final String ITEM_DESCRIPTION;

    public ItemDTO(double PRICE, String ITEM_ID, double VAT_RATE, String ITEM_DESCRIPTION) {
        this.PRICE = PRICE;
        this.ITEM_ID = ITEM_ID;
        this.VAT_RATE = VAT_RATE;
        this.ITEM_DESCRIPTION = ITEM_DESCRIPTION;
    }

    public double getVAT_RATE() {
        return VAT_RATE;
    }

    public String getITEM_DESCRIPTION() {
        return ITEM_DESCRIPTION;
    }

    public String getITEM_ID() {
        return ITEM_ID;
    }

    public double getPRICE() {
        return PRICE;
    }
}
