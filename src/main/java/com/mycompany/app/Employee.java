package com.mycompany.app;

public class Employee extends People{
    private Boolean working;
    private Boolean onBreak;

    public Employee(String name, Boolean working, Boolean onBreak) {
        super(name);
        this.working = working;
        this.onBreak = onBreak;
    }

    public Boolean getWorking() {
        return working;
    }

    public Boolean getOnBreak() {
        return onBreak;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name +
                ", onBreak=" + onBreak +
                ", working=" + working +'\'' +
                '}';
    }
}
