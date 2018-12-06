package com.elodie.homeshop;

public class TakeAwayDelivery implements Delivery {
    private String info = "Retrait sur place";

    @Override
    public double getPrice() {
        return 0;
    }
    @Override
    public String getInfo(){
        return info;
    }
}
