package com.elodie.homeshop;

public class DirectDelivery implements Delivery {

    private String info = "Livraison Directe";

    @Override
    public double getPrice() {
        return 4.99;
    }
    @Override
    public String getInfo(){
        return info;
    }
}
