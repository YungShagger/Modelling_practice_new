package com.mycompany.app;

public class Customer extends People {

    private int money;
    private int bedsNeeded;
    private Boolean frenchBedNeeded;
    private Boolean balchonyNeeded;
    private int customerId;


    public Customer(String name, int customerId, int money, int bedsNeeded, Boolean frenchBedNeeded, Boolean balchonyNeeded) {
        super(name);
        this.customerId = customerId;
        this.money = money;
        this.bedsNeeded = bedsNeeded;
        this.frenchBedNeeded = frenchBedNeeded;
        this.balchonyNeeded = balchonyNeeded;
    }

    public int getMoney() {
        return money;
    }

    public int getBedsNeeded() {
        return bedsNeeded;
    }

    public Boolean getFrenchBedNeeded() {
        return frenchBedNeeded;
    }

    public Boolean getBalchonyNeeded() {
        return balchonyNeeded;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name +
                ", bedsNeeded=" + bedsNeeded +
                ", frenchBedNeeded=" + frenchBedNeeded +
                ", balchonyNeeded=" + balchonyNeeded +
                ", money=" + money +'\'' +
                '}';
    }
}

