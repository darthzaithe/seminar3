package se.kth.iv1350.pos.integration;

/**
 * Handled item data transfers
 */

public class ItemDTO {
    private final int ITEM_ID;
    private final String ITEM_NAME;
    private final String ITEM_DESCRIPTION;
    private final double PRICE;
    private final double VAT_RATE;

    public ItemDTO(int ITEM_ID, String ITEM_NAME, String ITEM_DESCRIPTION, double PRICE, double VAT_RATE) {
        this.ITEM_ID = ITEM_ID;
        this.ITEM_NAME = ITEM_NAME;
        this.ITEM_DESCRIPTION = ITEM_DESCRIPTION;
        this.PRICE = PRICE;
        this.VAT_RATE = VAT_RATE;
    }

    public double getVAT_RATE() {
        return VAT_RATE;
    }

    public String getITEM_DESCRIPTION() {
        return ITEM_DESCRIPTION;
    }

    public int getITEM_ID() {
        return ITEM_ID;
    }

    public double getPRICE() {
        return PRICE;
    }
}
