package com.mycompany.app;

import com.mycompany.app.exception.HotelException;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    public List<Employee> employees = new ArrayList<>();
    public List<Customer> customers = new ArrayList<>();
    public Hotel hotel = new Hotel();

    public static void main() {
    }

    //public Employee findEmployeeByName() { }


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

    public void printEmployeeNames() {
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println(">>>> " + employee.getName());
        }
    }

    public void getEmployeeStatus() {
        System.out.println("Current Employees status:");
        String breakValue = new String();
        String workValue = new String();
        for (Employee employee : employees) {
            if (employee.getOnBreak().equals(false)) {
                breakValue = "not on break.";
            } else if (employee.getOnBreak().equals(true)) {
                breakValue = "currently on break.";
            }
            if (employee.getWorking().equals(true)) {
                workValue = "Working today ";
            } else if (employee.getWorking().equals(false)) {
                workValue = "Not working today ";
            }
            System.out.println("\n" + ">>>> " + employee.getName() + ":"
                    + "\n" + workValue + "and " + breakValue);
        }
    }


    public void getCustomerStatus() {
        System.out.println("Current Customers status:");
        String bedValue = new String();
        String balchonyValue = new String();
        for (Customer customer : customers) {
            if (customer.getBalchonyNeeded().equals(true)) {
                balchonyValue = "Yes";
            } else if (customer.getBalchonyNeeded().equals(false)) {
                balchonyValue = "No";
            }
            if (customer.getFrenchBedNeeded().equals(true)) {
                bedValue = "Yes";
            } else if (customer.getFrenchBedNeeded().equals(false)) {
                bedValue = "No";
            }
            System.out.println("\n" + ">>>> " + customer.getName() + ":"
                    + "\n" + "Money: " + customer.getMoney()
                    + "   Beds Needed: " + customer.getBedsNeeded()
                    + "  French Bed Needed: " + bedValue
                    + "  Balchony Needed: " + balchonyValue
                    + "\n");
        }
    }



}
