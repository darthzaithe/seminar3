package se.kth.iv1350.pos.integration;

import java.util.List;
import java.util.ArrayList;

public class ExternalInventory {
    private List<ItemDTO> itemList = new ArrayList<>();

    private void createInventory(){
        itemList.add(new ItemDTO(1000, "Keyboard", "A standard keyboard", 349, 1.25));
        itemList.add(new ItemDTO(1001, "Mouse", "A standard mouse", 129, 1.25));
        itemList.add(new ItemDTO(1002, "Energy Drink", "A fizzy caffeinated beverage", 19, 1.125));
        itemList.add(new ItemDTO(1003, "Light Souls", "A lighthearted action rpg", 599, 1.25));
        itemList.add(new ItemDTO(1004, "Computer Magazine", "A magazine about computers", 69, 1.06));
    }

    public ItemDTO getItemFromInventory(int itemId){
        for(ItemDTO item: itemList){
            if item.getITEM_ID() == itemId{
                return new ItemDTO(item.)
            }
        }
    }

    private static class

    public ExternalInventory() {
    }
}
