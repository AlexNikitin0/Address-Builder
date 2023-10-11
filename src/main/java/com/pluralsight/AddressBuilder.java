package com.pluralsight;
import java.util.*;
public class AddressBuilder {

    public static void main(String[] args) {

        StringBuilder address = new StringBuilder();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please provide the following information:\n" +
                "Full name: ");
        address.append(keyboard.nextLine()+"\n");
        System.out.print("Billing Street: ");
        address.append(keyboard.nextLine()+"\n");
        System.out.print("Billing City: ");
        address.append(keyboard.nextLine()+"\n");
        System.out.print("Billing State: ");
        address.append(keyboard.nextLine()+"\n");
        System.out.print("Billing Zip: ");

        address.append(keyboard.nextLine()+"\n");
        System.out.println();
        address.append("\n");
        System.out.print("Shipping Street: ");
        address.append(keyboard.nextLine()+"\n");
        System.out.print("Shipping City: ");
        address.append(keyboard.nextLine()+"\n");
        System.out.print("Shipping State: ");
        address.append(keyboard.nextLine()+"\n");
        System.out.print("Shipping Zip: ");
        address.append(keyboard.nextLine()+"\n");
        System.out.println();
        String myAddress = address.toString();

        System.out.println(myAddress);
    }

}
