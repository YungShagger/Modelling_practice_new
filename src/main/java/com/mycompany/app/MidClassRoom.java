package com.mycompany.app;

import com.mycompany.app.exception.HotelException;

import java.util.Scanner;

public class MidClassRoom extends Room {

    public MidClassRoom(String name, int roomId, int capacity, Boolean frenchBed, int cost, Boolean balchony, Boolean rentable, Boolean cleaned) {
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
            System.out.println(employee.getName() + " is currently on a break but since the room" + getRoomId() + "is a middle class room,"
                    + "\n" + "the cleaning takes priority. " + employee.getName() + "is currently being called back from the break.");
            pressAButton();
            employee.setOnBreak(false);
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
