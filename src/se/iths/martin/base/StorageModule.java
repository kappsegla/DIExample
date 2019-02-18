package se.iths.martin.base;

import com.google.inject.AbstractModule;
import se.iths.martin.storage.ListStorage;
import se.iths.martin.storage.SqLiteStorage;
import se.iths.martin.storage.Storage;

public class StorageModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(CustomerHandler.class);
        bind(Storage.class).to(SqLiteStorage.class);
    }
}
