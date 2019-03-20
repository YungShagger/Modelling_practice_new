package com.mycompany.app;

public class Customer extends People {

    private int money;
    private int bedsNeeded;
    private Boolean frenchBedNeeded;
    private Boolean balchonyNeeded;

    public Customer(int money, int bedsNeeded, Boolean frenchBedNeeded, Boolean balchonyNeeded) {
        this.money = money;
        this.bedsNeeded = bedsNeeded;
        this.frenchBedNeeded = frenchBedNeeded;
        this.balchonyNeeded = balchonyNeeded;
    }
}
