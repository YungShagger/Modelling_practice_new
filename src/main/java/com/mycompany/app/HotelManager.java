package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    public List<Employee> employees = new ArrayList<>();
    public List<Customer> customers = new ArrayList<>();
    public Hotel hotel = new Hotel();

    public static void main() {
        /*hotel.addBudgetRoom("room1",4,false,80,true);
        hotel.addBudgetRoom("room2",2,true,40,true);
        hotel.addBudgetRoom("room3",2,false,30,false);
        hotel.addBudgetRoom("room4",3,true,50,false);
        hotel.addBudgetRoom("room5",6,false,100,true);
        hotel.addBudgetRoom("room6",2,true,40,true);
        hotel.addBudgetRoom("room6",5,false,60,true);
        hotel.addBudgetRoom("room7",1,false,20,true);
        hotel.addBudgetRoom("room8",8,true,120,true);

        employees.add(new Employee("Andrew",true, false));
        employees.add(new Employee("Vanessa",true,true));
        employees.add(new Employee("Hyun",false,true));
        employees.add(new Employee("Samanta", true,false));

        customers.add(new Customer("Sonny", 1000,4,true,true));
        customers.add(new Customer("Ashley", 500,2,true,false));
        customers.add(new Customer("Linda",4000,3,false,false));
        customers.add(new Customer("mike",200,2,true,true));
        customers.add(new Customer("Andy",50,1,false,false));*/
    }


    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName, true, false));
    }


    public void addCustomer(String name, int money, int space, Boolean frenchBed, Boolean balchony) {
        customers.add(new Customer(name, money, space, frenchBed, balchony));
    }


    public void addBudgetRoom(String name, int room, Boolean frenchBed, int cost, Boolean balchony) {
        hotel.addBudgetRoom(name, room, frenchBed, cost, balchony);
    }



    public void addMidClassRoom(String name, int room, Boolean frenchBed, int cost, Boolean balchony) {
        hotel.addMidClassRoom(name, room, frenchBed, cost, balchony);
    }


    public void addPentHouseRoom(String name, int room, Boolean frenchBed, int cost, Boolean balchony) {
        hotel.addPentHouseRoom(name, room, frenchBed, cost, balchony);
    }


    public void printRooms() {
        System.out.println("Budget Rooms:");
        for (BudgetRoom budgetRoom : hotel.getBudgetRooms()) {
            System.out.println(">>>> " + budgetRoom);
        }
        System.out.println("\n");
        System.out.println("Midclass Rooms:");
        for (MidClassRoom midClassRoom : hotel.getMidClassRooms()) {
            System.out.println(">>>> " + midClassRoom);
        }
        System.out.println("\n");
        System.out.println("Pent House Rooms");
        for (PentHouseRoom pentHouseRoom : hotel.getPentHouseRooms()) {
            System.out.println(">>>> " + pentHouseRoom);
        }
    }


    public void printEmployees() {
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println(">>>> " + employee);
        }
    }


    public void printCustomers() {
        System.out.println("Customers");
        for (Customer customer : customers) {
            System.out.println(">>>> " + customer);
        }
    }

}
