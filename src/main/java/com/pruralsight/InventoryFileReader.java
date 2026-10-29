package com.pruralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InventoryFileReader {
    public static ArrayList<Inventory> readInventoryFromFile() {
        ArrayList<Inventory> inventory1 =  new ArrayList<>();
        int index = 0;

        try {
            FileReader fr1 = new FileReader("inventory.csv");
            BufferedReader br1 = new BufferedReader(fr1);

            String line;

            while ((line = br1.readLine()) != null) {
                //System.out.println(line);
                String[] split = line.split("[|]");

                int id = Integer.parseInt(split[0]);
                String name = split[1];
                double price = Double.parseDouble(split[2]);
                //System.out.println(id + name + price);

                inventory1.add(new Inventory(id, name, price));
                index++;

            }
            br1.close();


        } catch (IOException e) {
            System.out.println("ERROR:  An unexpected error occurred");
            e.printStackTrace();
        }
        return inventory1;

    }
}




