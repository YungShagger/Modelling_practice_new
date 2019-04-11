package com.mycompany;

import com.mycompany.app.exception.HotelException;
import com.mycompany.app.exception.NoSuchMenuPointException;
import com.mycompany.app.*;
import org.omg.CORBA.TRANSACTION_MODE;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static HotelManager hotelManager = loadFiles();
    public static void main(String[] args) throws NoSuchMenuPointException{



        clearScreen();
        System.out.println("Welcome to HOTEL GAZEEBO!");
        pressAButton();

        while (true) {
            clearScreen();
            Scanner scanner = new Scanner(System.in);
            System.out.println("MAIN MENU"
                    + "\n" + "\n" + "\n" + "How may I help you?"
                    + "\n" + "Press 1 to CHECK ROOMS"
                    + "\n" + "Press 2 to CHECK CUSTOMERS"
                    + "\n" + "Press 3 to CHECK EMPLOYEES"
                    + "\n" + "press 4 to CHANGE HOTEL"
                    + "\n" + "Press 0 to Exit");
            String menuChoice = scanner.nextLine();
            if (menuChoice.equals("1")) {
                while (true) {
                    clearScreen();
                    System.out.println("What would you like to do with the rooms?"
                            + "\n" + "Press 1 to LIST ROOMS"
                            + "\n" + "Press 2 to ADD ROOMS"
                            + "\n" + "Press 0 to go back");
                    String listChoice = scanner.nextLine();
                    if (listChoice.equals("1")) {
                        clearScreen();
                        hotelManager.printRooms();
                        pressAButton();
                    }
                    else if (listChoice.equals("2")) {
                        clearScreen();
                        System.out.println("What type of room would you like to add?"
                                + "\n" + "Press 1 to add a Budget Room"
                                + "\n" + "Press 2 to add a Mid Class Room"
                                + "\n" + "Press 3 to add a Pent House Room"
                                + "\n" + "Press 0 to go Back");
                        String addChoice = scanner.nextLine();
                        if (addChoice.equals("1")) {
                            clearScreen();
                            System.out.println("Adding a Budget Room to the system" + "\n" + "\n"
                                    + "\n" + "Please state the name of the room:");
                            String name = scanner.nextLine();
                            System.out.println("Please state how mane beds are in the room:");
                            int room = scanner.nextInt();
                            Boolean frenchBed = yesNoInputToBool("Please state if there is a frenchbed inthe room:");
                            System.out.println("Please state the cost of the room:");
                            int cost = scanner.nextInt();
                            Boolean balchony = yesNoInputToBool("Please state if there is a balchony in the room:");
                            hotelManager.addBudgetRoom(name, room, frenchBed, cost, balchony);
                            clearScreen();
                            System.out.println("Budget Room has been added to the system.");
                            pressAButton();
                        } else if (addChoice.equals("2")) {
                            clearScreen();
                            System.out.println("Adding a Mid Class Room to the system" + "\n" + "\n"
                                    + "\n" + "Please state the name of the room:");
                            String name = scanner.nextLine();
                            System.out.println("Please state how mane beds are in the room:");
                            int room = scanner.nextInt();
                            Boolean frenchBed = yesNoInputToBool("Please state if there is a frenchbed inthe room:");
                            System.out.println("Please state the cost of the room:");
                            int cost = scanner.nextInt();
                            Boolean balchony = yesNoInputToBool("Please state if there is a balchony in the room:");
                            hotelManager.addMidClassRoom(name, room, frenchBed, cost, balchony);
                            clearScreen();
                            System.out.println("Mid Class Room has been added to the system.");
                            pressAButton();
                        } else if (addChoice.equals("3")) {
                            clearScreen();
                            System.out.println("Adding a Pent House Room to the system" + "\n" + "\n"
                                    + "\n" + "Please state the name of the room:");
                            String name = scanner.nextLine();
                            System.out.println("Please state how mane beds are in the room:");
                            int room = scanner.nextInt();
                            Boolean frenchBed = yesNoInputToBool("Please state if there is a frenchbed inthe room:");
                            System.out.println("Please state the cost of the room:");
                            int cost = scanner.nextInt();
                            Boolean balchony = yesNoInputToBool("Please state if there is a balchony in the room:");
                            hotelManager.addPentHouseRoom(name, room, frenchBed, cost, balchony);
                            clearScreen();
                            System.out.println("Pent House Room has been added to the system.");
                            pressAButton();
                        } else if (addChoice.equals("0")) {
                        } else {
                            System.out.println("There is no menu point assigned to this number!");
                        }
                    }
                    else if (listChoice.equals("0")) {
                        break;
                    }
                    else {
                        System.out.println("There is no menu point assigned to this number!");
                    }
                }
            }
            else if (menuChoice.equals("2")) {
                while (true) {
                    clearScreen();
                    System.out.println("What would you like to do with the customers?"
                            + "\n" + "Press 1 to LIST CUSTOMERS"
                            + "\n" + "Press 2 to ADD CUSTOMERS"
                            + "\n" + "Press 3 to RENT A ROOM"
                            + "\n" + "Press 4 to DELETE CUSTOMERS"
                            + "\n" + "Press 0 to go Back");
                    String listChoice = scanner.nextLine();
                    if (listChoice.equals("1")) {
                        clearScreen();
                        hotelManager.getCustomerStatus();
                        pressAButton();
                    }
                    else if (listChoice.equals("2")) {
                        clearScreen();
                        System.out.println("Adding a new Customer to the system" + "\n" + "\n"
                                + "\n" + "Please state the name of the customer:");
                        String name = scanner.nextLine();
                        System.out.println("Please state the available money the customer willing to pay:");
                        int money = scanner.nextInt();
                        System.out.println("Please state the number of beds the customer needs:");
                        int room = scanner.nextInt();
                        Boolean fbed = yesNoInputToBool("Please state if the customer needs a frenchbed(Yes/No):");
                        Boolean balchony = yesNoInputToBool("Please state if the customer needs a balchony(Yes/No):");
                        hotelManager.addCustomer(name, money, room, fbed, balchony);
                        clearScreen();
                        System.out.println("Customer has been added to the system.");
                        pressAButton();
                    }
                    else if (listChoice.equals("3")) {
                        clearScreen();
                        hotelManager.getCustomerStatus();
                        System.out.println("\n" + "\n" + "Witch customer would you like to rent a room for?"
                                + "\n" + "Please state the ID!");
                        int customer = scanner.nextInt();
                        System.out.println("How much day would he like to stay?");
                        int days = scanner.nextInt();
                        scanner.nextLine();
                        while (true) {
                            System.out.println("What kind of room would you like to rent?"
                                    + "\n" + "Press 1 for BUDGET ROOMS"
                                    + "\n" + "Press 2 for MID CLASS ROOMS"
                                    + "\n" + "Press 3 for PENT HOUSE ROOMS"
                                    + "\n" + "Press 0 to go Back");
                            String classChoice = scanner.nextLine();
                            try {

                                if (classChoice.equals("1")){
                                    clearScreen();
                                    int nextRoom = 0;
                                    for (BudgetRoom budgetRoom : hotelManager.hotel.getBudgetRooms()) {
                                        System.out.println("\n" + "\n" + "\n" + "\n"+ "#" + ++nextRoom + "   " + budgetRoom.getName() + ":" );
                                        try {
                                            hotelManager.hotel.rent(hotelManager.findCustomerById(customer), budgetRoom, days);
                                        } catch (HotelException hotelException){
                                            System.out.println(hotelException.getMessage());
                                        }
                                    }
                                    System.out.println("\n" + "\n" + "Witch room would you like to rent for the customer?"
                                            + "\n" + "Please state the number of the room."
                                            + "\n" + "Or press 0 to go Back.");
                                    int room = scanner.nextInt();
                                    if (room == 0){
                                        break;
                                    }
                                    hotelManager.hotel.getBudgetRooms().get(room-1).setRentable(false);
                                    hotelManager.hotel.getBudgetRooms().get(room-1).setName(hotelManager.findCustomerById(customer).getName());
                                    clearScreen();
                                    System.out.println("The room number " + hotelManager.hotel.getBudgetRooms().get(room-1).getRoomId() + " is succesfuly rented"
                                            + "\n" + "under the name of " + hotelManager.findCustomerById(customer).getName() + ".");
                                    pressAButton();
                                    break;
                                }
                                else  if (classChoice.equals("2")){
                                    clearScreen();
                                    int nextRoom = 0;
                                    for (MidClassRoom midClassRoom : hotelManager.hotel.getMidClassRooms()) {
                                        System.out.println("\n" + "\n" + "\n" + "\n"+ "#" + ++nextRoom + "   " + midClassRoom.getName() + ":" );
                                        try {
                                            hotelManager.hotel.rent(hotelManager.findCustomerById(customer), midClassRoom, days);
                                        } catch (HotelException hotelException){
                                            System.out.println(hotelException.getMessage());
                                        }
                                    }
                                    System.out.println("\n" + "\n" + "Witch room would you like to rent for the customer?"
                                            + "\n" + "Please state the number of the room."
                                            + "\n" + "Or press 0 to go Back.");
                                    int room = scanner.nextInt();
                                    if (room == 0){
                                        break;
                                    }
                                    hotelManager.hotel.getMidClassRooms().get(room-1).setRentable(false);
                                    hotelManager.hotel.getMidClassRooms().get(room-1).setName(hotelManager.findCustomerById(customer).getName());
                                    clearScreen();
                                    System.out.println("The room number " + hotelManager.hotel.getMidClassRooms().get(room-1).getRoomId() + " is succesfuly rented"
                                            + "\n" + "under the name of " + hotelManager.findCustomerById(customer).getName() + ".");
                                    pressAButton();
                                    break;
                                }
                                else if (classChoice.equals("3")) {
                                    clearScreen();
                                    int nextRoom = 0;
                                    for (PentHouseRoom pentHouseRoom : hotelManager.hotel.getPentHouseRooms()) {
                                        System.out.println("\n" + "\n" + "\n" + "\n"+ "#" + ++nextRoom + "   " + pentHouseRoom.getName() + ":" );
                                        try {
                                            hotelManager.hotel.rent(hotelManager.findCustomerById(customer), pentHouseRoom, days);
                                        } catch (HotelException hotelException){
                                            System.out.println(hotelException.getMessage());
                                        }
                                    }
                                    System.out.println("\n" + "\n" + "Witch room would you like to rent for the customer?"
                                            + "\n" + "Please state the number of the room."
                                            + "\n" + "Or press 0 to go Back.");
                                    int room = scanner.nextInt();
                                    if (room == 0){
                                        break;
                                    }
                                    hotelManager.hotel.getPentHouseRooms().get(room-1).setRentable(false);
                                    hotelManager.hotel.getPentHouseRooms().get(room-1).setName(hotelManager.findCustomerById(customer).getName());
                                    clearScreen();
                                    System.out.println("The room number " + hotelManager.hotel.getPentHouseRooms().get(room-1).getRoomId() + " is succesfuly rented"
                                            + "\n" + "under the name of " + hotelManager.findCustomerById(customer).getName() + ".");
                                    pressAButton();
                                    break;
                                }
                                else if (classChoice.equals("0")){
                                    break;
                                }
                            }
                            catch (HotelException hotelException) {
                                System.out.println(hotelException.getMessage());
                            }
                        }
                    }
                    else if (listChoice.equals("4")) {
                        while (true){
                            try {
                                clearScreen();
                                hotelManager.getCustomerStatus();
                                System.out.println("Witch Customer do you want to remove from the system?"
                                        + "\n" + "Please state the Id!");
                                int customerToDelete = scanner.nextInt();
                                if (hotelManager.customers.contains(hotelManager.findCustomerById(customerToDelete))){
                                    Boolean areYouSure = yesNoInputToBool("Are you sure you want to remove the Customer?"
                                            + "\n" +"Please aswer with yes or no!");
                                    if (areYouSure.equals(true)) {
                                        clearScreen();
                                        hotelManager.deleteCustomer(hotelManager.findCustomerById(customerToDelete));
                                        System.out.println("The removal of the Customer was successful.");
                                        pressAButton();
                                        scanner.nextLine();
                                        break;
                                    }
                                    else {
                                        clearScreen();
                                        System.out.println("The removal of the Customer from the system has been cancelled.");
                                        pressAButton();
                                        scanner.nextLine();
                                        break;
                                    }
                                } else {
                                clearScreen();
                                System.out.println("There is no Customer assignet to the Id or the Id is incorrect");
                                pressAButton();
                                }
                            } catch (HotelException e){
                                clearScreen();
                                System.out.println(e.getMessage());
                                pressAButton();
                            }
                        }
                    }
                    else if (listChoice.equals("0")) {
                        break;
                    }
                    else {
                        System.out.println("There is no menu point assigned to this number!");
                    }
                }
            }
            else if (menuChoice.equals("3")) {
                while (true) {

                    clearScreen();
                    hotelManager.getEmployeeStatus();
                    System.out.println("\n" + "\n" + "What would you like to do?"
                            + "\n" + "Press 1 to CLEAN ROOM"
                            + "\n" + "Press 2 to CHANGE WORKING STATUS"
                            + "\n" + "Press 3 to CHANGE BREAK STATUS"
                            + "\n" + "Press 4 to ADD NEW EMPLOYEE"
                            + "\n" + "Press 5 to DELETE EMPLOYEE"
                            + "\n" + "Press 0 to go Back");
                    String employeeChoice = scanner.nextLine();
                    if (employeeChoice.equals("1")) {
                        clearScreen();
                        hotelManager.getEmployeeStatus();
                        System.out.println("\n" + "\n" + "\n" + "Witch Employee would you like to do the cleaning?"
                                + "\n" + "Please state the Employee Id!");
                        int emp = scanner.nextInt();
                        try {
                            Employee employee = hotelManager.findEmployeeById(emp);
                            if (hotelManager.employees.contains(employee)) {
                                clearScreen();
                                scanner.nextLine();
                                hotelManager.printRooms();
                                System.out.println("What type of room would you like to clean?"
                                        + "\n" + "Press 1 for the BUDGET ROOMS"
                                        + "\n" + "Press 2 for the MID CLASS ROOMS"
                                        + "\n" + "Press 3 for the PENT HOUSE ROOMS"
                                        + "\n" + "Press 0 to go Back");
                                String roomChoice = scanner.nextLine();
                                if (roomChoice.equals("1")) {
                                    clearScreen();
                                    hotelManager.printBudgetRooms();
                                    System.out.println("Witch Room would you like to clean?"
                                            + "\n" + "Please state the Room Number!");
                                    int room = scanner.nextInt();
                                    hotelManager.hotel.getBudgetRooms().get(room-1).clean(employee);
                                    scanner.nextLine();
                                }
                                else if (roomChoice.equals("2")) {
                                    clearScreen();
                                    hotelManager.printMidClassRooms();
                                    System.out.println("Witch Room would you like to clean?"
                                            + "\n" + "Please state the Room Number!");
                                    int room = scanner.nextInt();
                                    hotelManager.hotel.getMidClassRooms().get(room-1).clean(employee);
                                    scanner.nextLine();
                                }
                                else if (roomChoice.equals("3")) {
                                    clearScreen();
                                    hotelManager.printPentHouseRooms();
                                    System.out.println("Witch Room would you like to clean?"
                                            + "\n" + "Please state the Room Number!");
                                    int room = scanner.nextInt();
                                    hotelManager.hotel.getPentHouseRooms().get(room-1).clean(employee);
                                    scanner.nextLine();
                                }
                                else if (roomChoice.equals("0")) {
                                } else {
                                    clearScreen();
                                    System.out.println("There is no Employee assigned to this number!");
                                    pressAButton();
                                }
                            }
                        } catch (HotelException e) {
                            e.getMessage();
                        }
                    }
                    else if (employeeChoice.equals("2")) {
                        clearScreen();
                        hotelManager.getEmployeeStatus();
                        System.out.println("\n" + "\n" + "Witch Employees Working status would you like to change?");
                        int id = scanner.nextInt();
                        try{
                            hotelManager.changeWorkStatus(hotelManager.findEmployeeById(id));
                            clearScreen();
                            System.out.println("Working Status succesfuly changed.");
                            pressAButton();
                            scanner.nextLine();
                        } catch (HotelException e) {
                            e.getMessage();
                        }
                    }
                    else if (employeeChoice.equals("3")) {
                        clearScreen();
                        hotelManager.getEmployeeStatus();
                        System.out.println("\n" + "\n" + "Witch Employees Break status would you like to change?");
                        int id = scanner.nextInt();
                        try{
                            hotelManager.changeBreakStatus(hotelManager.findEmployeeById(id));
                            clearScreen();
                            System.out.println("Break Status succesfuly changed.");
                            pressAButton();
                            scanner.nextLine();
                        } catch (HotelException e) {
                            e.getMessage();
                        }
                    }
                    else if (employeeChoice.equals("4")) {
                        clearScreen();
                        System.out.println("Adding a new Employee to the system" + "\n" + "\n"
                        + "\n" + "Please state the name of the new employee:");
                        String name = scanner.nextLine();
                        hotelManager.addEmployee(name);
                        clearScreen();
                        System.out.println("Employee has been added to the system.");
                        pressAButton();
                        scanner.nextLine();
                    }
                    else if (employeeChoice.equals("5")) {
                        while (true){
                            try {
                                clearScreen();
                                hotelManager.getEmployeeStatus();
                                    System.out.println("Witch Employee do you want to remove from the system?"
                                        + "\n" + "Please state the Id!");
                                int employeeToDelete = scanner.nextInt();
                                if (hotelManager.employees.contains(hotelManager.findEmployeeById(employeeToDelete))){
                                    Boolean areYouSure = yesNoInputToBool("Are you sure you want to remove the Employee?"
                                            + "\n" +"Please aswer with yes or no!");
                                    if (areYouSure.equals(true)) {
                                        clearScreen();
                                        hotelManager.deleteEmployee(hotelManager.findEmployeeById(employeeToDelete));
                                        System.out.println("The removal of the Employee was successful.");
                                        pressAButton();
                                        scanner.nextLine();
                                        break;
                                    }
                                    else {
                                        clearScreen();
                                        System.out.println("The removal of the Employee from the system has been cancelled.");
                                        pressAButton();
                                        scanner.nextLine();
                                        break;
                                    }
                                } else {
                                    clearScreen();
                                    System.out.println("There is no Employee assignet to the Id or the Id is incorrect");
                                    pressAButton();
                                }
                            } catch (HotelException e){
                                clearScreen();
                                System.out.println(e.getMessage());
                                pressAButton();
                            }
                        }
                    }
                    else if (employeeChoice.equals("0")) {
                        break;
                    }
                    else {
                        clearScreen();
                        System.out.println("There is no menu point assigned to this number!");
                        pressAButton();
                    }
                }
            } else if (menuChoice.equals("4")) {
                clearScreen();
                System.out.println("Not yet implemented");
                pressAButton();
            } else if (menuChoice.equals("0")) {
                clearScreen();
                System.out.println("Thank you for using the Hotel Gazeebo Hotelmanager Beta app!"
                        + "\n" + "Have a great day!");
                saveFiles();
                break;
            } else {
                clearScreen();
                System.out.println("There is no menu point assigned to this number!");
                pressAButton();
            }
        }
    }
    public static HotelManager loadFiles() {
        try{
            FileInputStream fileIn = new FileInputStream("hotelGazeebo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            hotelManager = (HotelManager) in.readObject();
            in.close();
            fileIn.close();
            return hotelManager;
        } catch (IOException ioException) {
            ioException.printStackTrace();
            return hotelManager;
        } catch (ClassNotFoundException c) {
            System.out.println("Hotelmanager class not found");
            c.printStackTrace();
            return hotelManager;
        }
    }

    public static void saveFiles() {
        try {
            FileOutputStream fileOut = new FileOutputStream("hotelGazeebo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(hotelManager);
            out.close();
            fileOut.close();
            System.out.println("Succesfuly saved");
            pressAButton();
        }   catch (IOException ioExcepion) {
            ioExcepion.printStackTrace();
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

    private static Boolean yesNoInputToBool(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(message);
            String answer = scanner.nextLine();
            if (answer.equals("yes") || answer.equals("Yes") || answer.equals("YES") || answer.equals("y") || answer.equals("Y")) {
                return true;
            }else if (answer.equals("no") || answer.equals("No") || answer.equals("NO") || answer.equals("n") || answer.equals("N")) {
                return false;
            } else System.out.println("invalid andswer");
        }
    }

}
