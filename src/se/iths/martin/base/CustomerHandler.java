package se.iths.martin.base;

import se.iths.martin.models.Customer;
import se.iths.martin.storage.ListStorage;
import se.iths.martin.storage.Storage;

import java.util.Scanner;

public class CustomerHandler {

    Storage storage;

    public CustomerHandler(Storage storage) {
        this.storage = storage;
    }

    public void handleCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new customer name: ");
        String name = scanner.nextLine();
        int id = 0;

        Customer customer = new Customer(id, name);

        storage.addCustomer(customer);

        System.out.print("Search for customer: ");
        name = scanner.nextLine();

        Customer searchResult = storage.findFirstCustomer(name);
        //Print customer
        System.out.println(searchResult);

        storage.close();
    }



}
