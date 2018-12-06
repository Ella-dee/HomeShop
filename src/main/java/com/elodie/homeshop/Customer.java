package com.elodie.homeshop;

public class Customer {
    protected String fullname;
    protected String address;

    public Customer(String fullname, String address){
        this.fullname=fullname;
        this.address=address;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }
}
