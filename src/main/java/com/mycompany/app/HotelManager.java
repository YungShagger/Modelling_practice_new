package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    private static List<Employee> employees = new ArrayList<>();
    private static List<Customer> customers = new ArrayList<>();
    private static Hotel hotel = new Hotel();

    public static void main() {
        hotel.addBudgetRoom("room1",4,false,80,true);
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
        customers.add(new Customer("Andy",50,1,false,false));
    }
    private static void printRooms() {
        for (BudgetRoom budgetRoom : hotel.getBudgetRooms()) {
            System.out.println(budgetRoom);
        }
        for (MidClassRoom midClassRoom : hotel.getMidClassRooms()) {
            System.out.println(midClassRoom);
        }
        for (PentHouseRoom pentHouseRoom : hotel.getPentHouseRooms()) {
            System.out.println(pentHouseRoom);
        }
    }
    private  static  void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static void printCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
