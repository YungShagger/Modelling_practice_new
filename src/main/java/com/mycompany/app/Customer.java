package com.mycompany.app;

public class Customer extends People {

    private int money;
    private int bedsNeeded;
    private Boolean frenchBedNeeded;
    private Boolean balchonyNeeded;

    public Customer(String name, int money, int bedsNeeded, Boolean frenchBedNeeded, Boolean balchonyNeeded) {
        super(name);
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

