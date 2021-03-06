package com.mycompany.app;

import com.mycompany.app.exception.HotelException;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManager implements java.io.Serializable {
    public List<Employee> employees = new ArrayList<>();
    public List<Customer> customers = new ArrayList<>();
    public Hotel hotel = new Hotel();

    private static int workerId = 0;
    private static int customerId = 100;

    public static void main() {
    }


    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName, ++workerId, true, false));
    }


    public void addCustomer(String name, int money, int space, Boolean frenchBed, Boolean balchony) {
        customers.add(new Customer(name, ++customerId, money, space, frenchBed, balchony));
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

    public void deleteEmployee(Employee employee) {
        if (employees.contains(employee)) {
            employees.remove(employee);
        }
    }

    public void deleteCustomer(Customer customer) {
        if (customers.contains(customer)) {
            customers.remove(customer);
        }
    }

    public Customer findCustomerById(int userInput) throws HotelException {
        for (Customer customer : customers) {
            if ((customer.getCustomerId() == userInput)) {
                return customer;
            }
        }
        throw new HotelException("There is no Customer assigned to the ID or incorrect ID!");
    }

    public Employee findEmployeeById(int userInput) throws HotelException {
        for (Employee employee : employees) {
            if ((employee.getWorkerId() == userInput)) {
                return employee;
            }
        }
        throw new HotelException("There is no Employee assigned to the ID or incorrect ID!");
    }

    public void changeWorkStatus(Employee employee) {
        if (employee.getWorking().equals(true)) {
            employee.setWorking(false);
            employee.setOnBreak(false);
        } else {
            employee.setWorking(true);
            employee.setOnBreak(false);
        }
    }

    public void changeBreakStatus(Employee employee) {
        if (employee.getOnBreak().equals(true)) {
            employee.setOnBreak(false);
        } else {
            employee.setOnBreak(true);
        }
    }

    public void printBudgetRooms() {
        int nextRoom = 0;
        String rent = new String();
        String clean = new String();
        String balchony = new String();
        String frenchBed = new String();
        System.out.println("Budget Rooms:" + "\n");
        for (BudgetRoom budgetRoom : hotel.getBudgetRooms()) {
            if (budgetRoom.getRentable().equals(true)) {
                rent = "Yes";
            } else rent = "No";
            if (budgetRoom.getCleaned().equals(true)) {
                clean = "Yes";
            } else clean = "No";
            if (budgetRoom.getBalchony().equals(true)) {
                balchony = "Yes";
            } else balchony = "No";
            if (budgetRoom.getFrenchBed().equals(true)) {
                frenchBed = "Yes";
            } else frenchBed = "No";
            System.out.println("\n" + "#" + ++nextRoom + "  " + budgetRoom.getName() + "ID: " + budgetRoom.getRoomId()
                    + "\n" + "Number of Beds: " + budgetRoom.getCapacity() + "   Cost/Day: " + budgetRoom.getCost()
                    + "\n" + "Have a French Bed: " + frenchBed + "   Have a Balchony: " + balchony
                    + "\n" + "Status:    " + "Rentable: " + rent + "   Cleaned: " + clean);
        }
    }

    public void printMidClassRooms() {
        int nextRoom = 0;
        String rent = new String();
        String clean = new String();
        String balchony = new String();
        String frenchBed = new String();
        System.out.println("\n" + "\n" + "\n" + "Mid Class Rooms:" + "\n");
        for (MidClassRoom midClassRoom : hotel.getMidClassRooms()) {
            if (midClassRoom.getRentable().equals(true)) {
                rent = "Yes";
            } else rent = "No";
            if (midClassRoom.getCleaned().equals(true)) {
                clean = "Yes";
            } else clean = "No";
            if (midClassRoom.getBalchony().equals(true)) {
                balchony = "Yes";
            } else balchony = "No";
            if (midClassRoom.getFrenchBed().equals(true)) {
                frenchBed = "Yes";
            } else frenchBed = "No";
            System.out.println("\n" + "#" + ++nextRoom + "  " + midClassRoom.getName() + "ID: " + midClassRoom.getRoomId()
                    + "\n" + "Number of Beds: " + midClassRoom.getCapacity() + "   Cost/Day: " + midClassRoom.getCost()
                    + "\n" + "Have a French Bed: " + frenchBed + "   Have a Balchony: " + balchony
                    + "\n" + "Status:    " + "Rentable: " + rent + "   Cleaned: " + clean);
        }
    }

    public void printPentHouseRooms() {
        int nextRoom = 0;
        String rent = new String();
        String clean = new String();
        String balchony = new String();
        String frenchBed = new String();
        System.out.println("\n" + "\n" + "\n" + "Pent House Rooms:" + "\n");
        for (PentHouseRoom pentHouseRoom : hotel.getPentHouseRooms()) {
            if (pentHouseRoom.getRentable().equals(true)) {
                rent = "Yes";
            } else rent = "No";
            if (pentHouseRoom.getCleaned().equals(true)) {
                clean = "Yes";
            } else clean = "No";
            if (pentHouseRoom.getBalchony().equals(true)) {
                balchony = "Yes";
            } else balchony = "No";
            if (pentHouseRoom.getFrenchBed().equals(true)) {
                frenchBed = "Yes";
            } else frenchBed = "No";
            System.out.println("\n" + "#" + ++nextRoom + "  " + pentHouseRoom.getName() + "ID: " + pentHouseRoom.getRoomId()
                    + "\n" + "Number of Beds: " + pentHouseRoom.getCapacity() + "   Cost/Day: " + pentHouseRoom.getCost()
                    + "\n" + "Have a French Bed: " + frenchBed + "   Have a Balchony: " + balchony
                    + "\n" + "Status:    " + "Rentable: " + rent + "   Cleaned: " + clean);
        }
    }

    public void printRooms() {
        int nextRoom = 0;
        String rent = new String();
        String clean = new String();
        String balchony = new String();
        String frenchBed = new String();
        System.out.println("Budget Rooms:" + "\n");
        for (BudgetRoom budgetRoom : hotel.getBudgetRooms()) {
            if (budgetRoom.getRentable().equals(true)) {
                rent = "Yes";
            } else rent = "No";
            if (budgetRoom.getCleaned().equals(true)) {
                clean = "Yes";
            } else clean = "No";
            if (budgetRoom.getBalchony().equals(true)) {
                balchony = "Yes";
            } else balchony = "No";
            if (budgetRoom.getFrenchBed().equals(true)) {
                frenchBed = "Yes";
            } else frenchBed = "No";
            System.out.println("\n" + "#" + ++nextRoom + "  " + budgetRoom.getName() + "ID: " + budgetRoom.getRoomId()
                    + "\n" + "Number of Beds: " + budgetRoom.getCapacity() + "   Cost/Day: " + budgetRoom.getCost()
                    + "\n" + "Have a French Bed: " + frenchBed + "   Have a Balchony: " + balchony
                    + "\n" + "Status:    " + "Rentable: " + rent + "   Cleaned: " + clean);
        }
        nextRoom = 0;
        System.out.println("\n" + "\n" + "\n" + "Mid Class Rooms:" + "\n");
        for (MidClassRoom midClassRoom : hotel.getMidClassRooms()) {
            if (midClassRoom.getRentable().equals(true)) {
                rent = "Yes";
            } else rent = "No";
            if (midClassRoom.getCleaned().equals(true)) {
                clean = "Yes";
            } else clean = "No";
            if (midClassRoom.getBalchony().equals(true)) {
                balchony = "Yes";
            } else balchony = "No";
            if (midClassRoom.getFrenchBed().equals(true)) {
                frenchBed = "Yes";
            } else frenchBed = "No";
            System.out.println("\n" + "#" + ++nextRoom + "  " + midClassRoom.getName() + "ID: " + midClassRoom.getRoomId()
                    + "\n" + "Number of Beds: " + midClassRoom.getCapacity() + "   Cost/Day: " + midClassRoom.getCost()
                    + "\n" + "Have a French Bed: " + frenchBed + "   Have a Balchony: " + balchony
                    + "\n" + "Status:    " + "Rentable: " + rent + "   Cleaned: " + clean);
        }
        nextRoom = 0;
        System.out.println("\n" + "\n" + "\n" + "Pent House Rooms:" + "\n");
        for (PentHouseRoom pentHouseRoom : hotel.getPentHouseRooms()) {
            if (pentHouseRoom.getRentable().equals(true)) {
                rent = "Yes";
            } else rent = "No";
            if (pentHouseRoom.getCleaned().equals(true)) {
                clean = "Yes";
            } else clean = "No";
            if (pentHouseRoom.getBalchony().equals(true)) {
                balchony = "Yes";
            } else balchony = "No";
            if (pentHouseRoom.getFrenchBed().equals(true)) {
                frenchBed = "Yes";
            } else frenchBed = "No";
            System.out.println("\n" + "#" + ++nextRoom + "  " + pentHouseRoom.getName() + "ID: " + pentHouseRoom.getRoomId()
                    + "\n" + "Number of Beds: " + pentHouseRoom.getCapacity() + "   Cost/Day: " + pentHouseRoom.getCost()
                    + "\n" + "Have a French Bed: " + frenchBed + "   Have a Balchony: " + balchony
                    + "\n" + "Status:    " + "Rentable: " + rent + "   Cleaned: " + clean);
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
            System.out.println("\n" + ">>>> " + employee.getName()+ "  ID:"+ employee.getWorkerId()
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
            System.out.println("\n" + ">>>> " + customer.getName()+ "  ID:"+ customer.getCustomerId()
                    + "\n" + "Money: " + customer.getMoney()
                    + "   Beds Needed: " + customer.getBedsNeeded()
                    + "  French Bed Needed: " + bedValue
                    + "  Balchony Needed: " + balchonyValue
                    + "\n");
        }
    }



}
