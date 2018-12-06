package com.elodie.homeshop;

public class RelayDelivery implements Delivery {
    private int number;
    private String info;

    public RelayDelivery(int number) {
        this.number = number;
        this.info="Livraison en point relais";
    }

    @Override
    public double getPrice() {
        if (number >= 1 && number <= 22) {
            return 0;
        } else if (number >= 23 && number <= 47) return 2.99;
        else return 4.99;
    }
    @Override
    public String getInfo(){
        return info;
    }
}
