package se.iths.martin.models;

import java.io.Serializable;

public class Customer implements Serializable {

    public int id;
    public String name;

    public Customer(){}

    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer { id: " + id + " name: " + name + "}";
    }
}
