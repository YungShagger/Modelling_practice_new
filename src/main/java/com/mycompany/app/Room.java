package com.mycompany.app;

public class Room {

    private String name;
    private int id;
    private int capacity;
    private Boolean frenchBed;
    private int cost;
    private Boolean balchony;
    private Boolean rentable;
    private Boolean cleaned;

    public Boolean getRentable() {
        return rentable;
    }

    public Boolean getCleaned() {
        return cleaned;
    }

    public int getCapacity() {
        return capacity;
    }

    public Boolean getFrenchBed() {
        return frenchBed;
    }

    public int getCost() {
        return cost;
    }

    public Boolean getBalchony() {
        return balchony;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Room(String name, int id, int capacity, Boolean frenchBed, int cost, Boolean balchony, Boolean rentable, Boolean cleaned) {
        this.name = name;
        this.id = id;
        this.capacity = capacity;
        this.frenchBed = frenchBed;
        this.cost = cost;
        this.balchony = balchony;
        this.rentable = rentable;
        this.cleaned = cleaned;
    }
}
