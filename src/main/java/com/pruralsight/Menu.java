package com.pruralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void displayMenu(ArrayList<Inventory> inventory1) throws InterruptedException{
        Scanner myScanner = new Scanner(System.in);
        try{
            while (true) {
                System.out.println("\n--- What do you want to do?---- ");
                System.out.println("1- List all products: ");
                System.out.println("2- Lookup a product by its id: ");
                System.out.println("3- Find all products within a price range: ");
                System.out.println("4- Add a new product: ");
                System.out.print("5- Quit the application: ");

                int command = myScanner.nextInt();
                switch(command) {
                    case 1:
                        for (int i = 0; i < inventory1.size() ; i++) {
                            Inventory inventory = inventory1.get(i);

                            if (inventory != null) {

                                System.out.printf("%d | %s | $%.2f%n",
                                        inventory.getId(),
                                        inventory.getName(),
                                        inventory.getPrice());
                                        Thread.sleep(1000);
                            }

                        }
                        break;
                        case 2:
                            System.out.print("\nEnter The Id of the product to search: \n");
                            int lookup = myScanner.nextInt();
                            for ( int i = 0; i < inventory1.size(); i++ ){
                                Inventory inventory = inventory1.get(i);

                                if (lookup == inventory.getId()) {
                                    System.out.printf("%d | %s | $%.2f%n",
                                            inventory.getId(),
                                            inventory.getName(),
                                            inventory.getPrice());
                                            Thread.sleep(1000);
                                    break;

                                }
                            }
                            break;
                            case 3:
                                System.out.print(" 3 Find all products within a price range: \n");

                                System.out.print("Enter The Range From: ");
                                double firstRange = myScanner.nextDouble();

                                System.out.print("Enter The Range to: ");
                                double secondRange = myScanner.nextDouble();


                                for ( int i = 0; i < inventory1.size(); i++ ){
                                    Inventory inventory = inventory1.get(i);

                                    if (firstRange <= inventory.getPrice() && secondRange >= inventory.getPrice()) {
                                        System.out.printf("%d | %s | $%.2f%n",
                                                inventory.getId(),
                                                inventory.getName(),
                                                inventory.getPrice());
                                                Thread.sleep(1000);

                                    }
                                }
                                break;
                                case 4:
                                    System.out.print("Please Enter Product Id \n");
                                    int id = myScanner.nextInt();
                                    myScanner.nextLine();

                                    System.out.print("Add new product's Name: \n");
                                    String name = myScanner.nextLine();
                                    System.out.print("Add new product's Price: \n");
                                    Double price = myScanner.nextDouble();

                                    Inventory inventory = new Inventory(id, name, price);

                                    inventory1.add(inventory);
                                    System.out.println("New Product Added");
                                    System.out.printf("%d | %s | $%.2f%n",
                                            inventory.getId(),
                                            inventory.getName(),
                                            inventory.getPrice());
                                            Thread.sleep(1000);
                                    break;

                                    case 5:
                                        System.out.println("Goodbye!");
                                        return;
                                        default:
                                            System.out.println("Invalid command!");

                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
    }
}
