package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Inventory> inventory1 = getInventory();
        Collections.sort(inventory1, Comparator.comparing(Inventory::getName));
        Menu.displayMenu(inventory1);

        for (Inventory inventory : inventory1) {
            if (inventory != null) {
                System.out.printf("%d | %s | $%.2f%n",
                        inventory.getId(),
                        inventory.getName(),
                        inventory.getPrice());

                Thread.sleep(1000);
            }
        }
    }

    public static ArrayList<Inventory> getInventory() {
        return InventoryFileReader.readInventoryFromFile();
    }
}
