package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Inventory {
    private int id;
    private String name;
    private double price;

    public Inventory(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void setId(int id){
        this.id =id;
    }
    public void setName(String Name){
        this.name = name;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
