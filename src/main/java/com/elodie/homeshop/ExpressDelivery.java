package com.elodie.homeshop;

public class ExpressDelivery implements Delivery {
    private String city;
    private String info;

    public ExpressDelivery(String city){
        this.city=city;
        this.info="Livraison Expresse";
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
