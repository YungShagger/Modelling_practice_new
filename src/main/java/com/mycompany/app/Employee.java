package com.mycompany.app;

public class Employee extends People{
    private Boolean working;
    private Boolean onBreak;
    private int workerId;

    public Employee(String name, int workerId, Boolean working, Boolean onBreak) {
        super(name);
        this.workerId = workerId;
        this.working = working;
        this.onBreak = onBreak;
    }

    public Boolean getWorking() {
        return working;
    }

    public Boolean getOnBreak() {
        return onBreak;
    }

    public void setWorking(Boolean working) {
        this.working = working;
    }

    public void setOnBreak(Boolean onBreak) {
        this.onBreak = onBreak;
    }

    public int getWorkerId() {
        return workerId;
    }

}
