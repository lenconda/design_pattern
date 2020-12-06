package top.lenconda.design_pattern.task1.task1_9;

import java.io.*;

public class Customer implements Serializable {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Customer: { address: " + address + ", name: " + name + "}";
    }

    public Customer clone(){
        Customer clone = null;
        try {
            clone = (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public Object deepClone() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return(objectInputStream.readObject());
    }
}
