package se.iths.martin.base;

import com.google.inject.Guice;
import com.google.inject.Injector;
import se.iths.martin.storage.ListStorage;
import se.iths.martin.storage.SqLiteStorage;

public class Main {

    public static void main(String[] args) {

        //CustomerHandler customerHandler= new CustomerHandler(new SqLiteStorage());
        //customerHandler.handleCustomer();

        Injector injector = Guice.createInjector(new StorageModule());
        CustomerHandler customerHandler = injector.getInstance(CustomerHandler.class);
        customerHandler.handleCustomer();
   }
}
