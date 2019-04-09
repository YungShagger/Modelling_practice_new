package com.mycompany.app;

import com.mycompany.app.exception.HotelException;

public abstract class Room {

    protected String name;
    protected int roomId;
    protected int capacity;
    protected Boolean frenchBed;
    protected int cost;
    protected Boolean balchony;
    protected Boolean rentable;
    protected Boolean cleaned;

    public Boolean getRentable() {
        return rentable;
    }

    public Boolean getCleaned() {
        return cleaned;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setRentable(Boolean rentable) {
        this.rentable = rentable;
    }

    public void setCleaned(Boolean cleaned) {
        this.cleaned = cleaned;
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

    public int getRoomId() {
        return roomId;
    }

    public String getName() {
        return name;
    }

    public Room(String name, int roomId, int capacity, Boolean frenchBed, int cost, Boolean balchony, Boolean rentable, Boolean cleaned) {
        this.name = name;
        this.roomId = roomId;
        this.capacity = capacity;
        this.frenchBed = frenchBed;
        this.cost = cost;
        this.balchony = balchony;
        this.rentable = rentable;
        this.cleaned = cleaned;
    }

    public abstract void clean(Employee employee) throws HotelException;

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", id=" + roomId +
                ", capacity=" + capacity +
                ", frenchBed=" + frenchBed +
                ", cost=" + cost +
                ", balchony=" + balchony +
                ", rentable=" + rentable +
                ", cleaned=" + cleaned +
                '}';
    }
}
