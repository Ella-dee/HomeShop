package com.elodie.homeshop;

public class Fridge extends Product {
    private int liter;
    private boolean freezer;

    public Fridge(String name, String description, double price, int liter, boolean freezer) {
        super(name, description, price);
        this.freezer=freezer;
        this.liter=liter;
    }

    public int getLiter() {
        return liter;
    }

    public boolean isFreezer() {
        return freezer;
    }
}
