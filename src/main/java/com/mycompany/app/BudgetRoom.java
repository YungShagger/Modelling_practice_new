package com.mycompany.app;

import com.mycompany.app.exception.HotelException;

import java.util.Scanner;

public class BudgetRoom extends Room implements java.io.Serializable {

    public BudgetRoom(String name, int roomId, int capacity, Boolean frenchBed, int cost, Boolean balchony, Boolean rentable, Boolean cleaned) {
        super(name, roomId, capacity, frenchBed, cost, balchony, rentable, cleaned);
    }

    @Override
    public void clean(Employee employee) {
        if (employee.getWorking().equals(false)) {
            clearScreen();
            System.out.println(employee.getName() + " can't clean the room " + getRoomId() + ", due to him not at work currently.");
            pressAButton();
        } else if (employee.getOnBreak().equals(true)) {
            clearScreen();
            System.out.println(employee.getName() + " can't clean the room " + getRoomId() + ", due to him is on a break currently.");
            pressAButton();
        } else if (getCleaned().equals(true)) {
            clearScreen();
            System.out.println(employee.getName() + "can't clean the room " + getRoomId() + ", due to the room has been already cleaned.");
            pressAButton();
        } else {
            setCleaned(true);
            clearScreen();
            System.out.println("The room " + getRoomId() + " has been successfuly cleaned.");
            pressAButton();
        }
    }

    private static void clearScreen() {
        System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n"
                + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n"
                + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n"
                + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n"
                + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
    }

    private static void pressAButton() {
        System.out.println("\n" + "Press a button to continue.");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
    }
}
