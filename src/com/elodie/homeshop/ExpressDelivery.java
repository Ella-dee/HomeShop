package com.elodie.homeshop;

public class ExpressDelivery implements Delivery {
    private String city;
    private String info = "Livraison Expresse";

    public ExpressDelivery(String city){
        this.city=city;
    }

    @Override
    public String getInfo(){
        return info;
    }
    @Override
    public double getPrice() {
        if(city.equals("Paris"))return 6.99;
        else return 4.99;
    }
}
