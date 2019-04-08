import com.mycompany.app.exception.HotelException;
import com.mycompany.app.exception.NoSuchMenuPointException;
import com.mycompany.app.*;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    private static HotelManager hotelManager = new HotelManager();
    public static void main(String[] args) throws NoSuchMenuPointException{

        hotelManager.addPentHouseRoom("PentHouse1",6,false,1000,true);
        hotelManager.addPentHouseRoom("PentHouse2",8,true,1300,true);
        hotelManager.addBudgetRoom("Budget1",1,false,30,false);
        hotelManager.addMidClassRoom("MidClass1",4,false,200,false);
        hotelManager.addMidClassRoom("MidClass2",2,true,170,true);
        hotelManager.addPentHouseRoom("PentHouse3",2,true,900,true);
        hotelManager.addBudgetRoom("Budget2",2,false,60,false);

        hotelManager.addEmployee("David Dickinson");
        hotelManager.addEmployee("Lea Leander");
        hotelManager.addEmployee("Kevin Whipaloo");
        hotelManager.addEmployee("Neil Degrasse Tyson");
        hotelManager.addEmployee("Kevin Spacey");

        hotelManager.addCustomer("Sonny Mayers", 1000,4,true,true);
        hotelManager.addCustomer("Ashley May", 500,2,true,false);
        hotelManager.addCustomer("Linda Stone",4000,3,false,false);
        hotelManager.addCustomer("Mike Wasobsky",200,2,true,true);
        hotelManager.addCustomer("Andy DeKool",50,1,false,false);

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
                    + "\n" + "Press 4 to QUICK RENT"
                    + "\n" + "press 5 to CHANGE HOTEL"
                    + "\n" + "Press 0 to Exit");
            String menuChoice = scanner.nextLine();
            if (menuChoice.equals("1")) {
                while (true) {
                    clearScreen();
                    System.out.println("What would you like to do with the rooms?"
                            + "\n" + "Press 1 to LIST ROOMS"
                            + "\n" + "Press 2 to ADD ROOMS"
                            + "\n" + "Press 3 to DELETE ROOMS"
                            + "\n" + "Press 0 to go back");
                    String listChoice = scanner.nextLine();
                    if (listChoice.equals("1")) {
                        clearScreen();
                        hotelManager.printRooms();
                        pressAButton();
                    } else if (listChoice.equals("2")) {
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
                            System.out.println("Please state if there is a frenchbed inthe room:");
                            Boolean frenchBed = scanner.nextBoolean();
                            System.out.println("Please state the cost of the room:");
                            int cost = scanner.nextInt();
                            System.out.println("Please state if there is a balchony in the room:");
                            Boolean balchony = scanner.nextBoolean();
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
                            System.out.println("Please state if there is a frenchbed inthe room:");
                            Boolean frenchBed = scanner.nextBoolean();
                            System.out.println("Please state the cost of the room:");
                            int cost = scanner.nextInt();
                            System.out.println("Please state if there is a balchony in the room:");
                            Boolean balchony = scanner.nextBoolean();
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
                            System.out.println("Please state if there is a frenchbed inthe room:");
                            Boolean frenchBed = scanner.nextBoolean();
                            System.out.println("Please state the cost of the room:");
                            int cost = scanner.nextInt();
                            System.out.println("Please state if there is a balchony in the room:");
                            Boolean balchony = scanner.nextBoolean();
                            hotelManager.addPentHouseRoom(name, room, frenchBed, cost, balchony);
                            clearScreen();
                            System.out.println("Pent House Room has been added to the system.");
                            pressAButton();
                        } else if (addChoice.equals("0")) {
                        } else {
                            System.out.println("There is no menu point assigned to this number!");
                        }
                    } else if (listChoice.equals("3")) {
                        clearScreen();
                        System.out.println("Not yet implemented");
                        pressAButton();
                    } else if (listChoice.equals("0")) {
                        break;
                    } else {
                        System.out.println("There is no menu point assigned to this number!");
                    }
                }
            } else if (menuChoice.equals("2")) {
                while (true) {
                    clearScreen();
                    System.out.println("What would you like to do with the customers?"
                            + "\n" + "Press 1 to LIST CUSTOMERS"
                            + "\n" + "Press 2 to ADD CUSTOMERS"
                            + "\n" + "Press 3 to DELETE CUSTOMERS"
                            + "\n" + "Press 4 to RENT A ROOM"
                            + "\n" + "Press 0 to go Back");
                    String listChoice = scanner.nextLine();
                    if (listChoice.equals("1")) {
                        clearScreen();
                        hotelManager.getCustomerStatus();
                        pressAButton();
                    } else if (listChoice.equals("2")) {
                        clearScreen();
                        System.out.println("Adding a new Customer to the system" + "\n" + "\n"
                                + "\n" + "Please state the name of the customer:");
                        String name = scanner.nextLine();
                        System.out.println("Please state the available money the customer willing to pay:");
                        int money = scanner.nextInt();
                        System.out.println("Please state the number of beds the customer needs:");
                        int room = scanner.nextInt();
                        System.out.println("Please state if the customer needs a frenchbed:");
                        Boolean frenchBed = scanner.nextBoolean();
                        System.out.println("Please state if the customer needs a balchony:");
                        Boolean balchony = scanner.nextBoolean();
                        hotelManager.addCustomer(name, money, room, frenchBed, balchony);
                        clearScreen();
                        System.out.println("Customer has been added to the system.");
                        pressAButton();
                    } else if (listChoice.equals("3")) {
                        clearScreen();
                        System.out.println("Not yet implemented");
                        pressAButton();
                    } else if (listChoice.equals("0")) {
                        break;
                    } else {
                        System.out.println("There is no menu point assigned to this number!");
                    }
                }
            } else if (menuChoice.equals("3")) {
                while (true) {
                    clearScreen();
                    hotelManager.getEmployeeStatus();
                    System.out.println("\n" + "\n" + "What would you like to do?"
                            + "\n" + "Press 1 to CLEAN ROOM"
                            + "\n" + "Press 2 to CHANGE BREAK STATUS"
                            + "\n" + "Press 3 to CHANGE WORK STATUS"
                            + "\n" + "Press 0 to go Back");
                    String employeeChoice = scanner.nextLine();
                    if (employeeChoice.equals("1")) {

                    } else if (employeeChoice.equals("2")) {

                    } else if (employeeChoice.equals("3")) {

                    } else if (employeeChoice.equals("0")) {
                        break;
                    } else {
                        System.out.println("There is no menu point assigned to this number!");
                    }
                }


            } else if (menuChoice.equals("4")) {
                clearScreen();
                System.out.println("Not yet implemented");
                pressAButton();

            } else if (menuChoice.equals("5")) {
                clearScreen();
                System.out.println("Not yet implemented");
                pressAButton();
            } else if (menuChoice.equals("0")) {
                clearScreen();
                System.out.println("Thank you for using the Hotel Gazeebo Hotelmanager Beta app!"
                        + "\n" + "Have a great day!");
                break;
            } else {
                System.out.println("There is no menu point assigned to this number!");
            }
        }

    }

    private static void clearScreen() {
        System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n"
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