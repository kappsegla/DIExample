package se.iths.martin.storage;

import se.iths.martin.models.Customer;

public interface Storage {

   void addCustomer(Customer customer);

   Customer findFirstCustomer(String name);

   void close();
}
