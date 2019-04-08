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



        while (true) {
            clearScreen();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to HOTEL GAZEEBO!"
                    + "\n" + "\n" + "\n" + "How may I help you ?"
                    + "\n" + "Press 1 for the LISTING"
                    + "\n" + "Press 2 for the ADDING"
                    + "\n" + "Press 3 for the CLEANIN"
                    + "\n" + "Press 4 to CHECK EMPLOYEES"
                    + "\n" + "Press 0 to Exit");
            String menuChoice = scanner.nextLine();
            if (menuChoice.equals("1")) {
                clearScreen();
                System.out.println("What would you like to list out?"
                        + "\n" + "Press 1 to list ROOMS"
                        + "\n" + "Press 2 to list Employees"
                        + "\n" + "Press 3 to list Customers");
                String listChoice = scanner.nextLine();
                if (listChoice.equals("1")) {
                    clearScreen();
                    hotelManager.printRooms();
                    pressAButton();
                } else if (listChoice.equals("2")) {
                    clearScreen();
                    hotelManager.printEmployees();
                    pressAButton();
                } else if (listChoice.equals("3")) {
                    clearScreen();
                    hotelManager.printCustomers();
                    pressAButton();
                } else throw new NoSuchMenuPointException("There is no menu point assigned to this number!");
            } else if (menuChoice.equals("2")) {
                clearScreen();
                System.out.println("What would you like to add the the system?"
                        + "\n" + "Press 1 to add a Room"
                        + "\n" + "Press 2 to add an Employee"
                        + "\n" + "Press 3 to add a Customer");
                String listChoice = scanner.nextLine();
                if (listChoice.equals("1")) {
                    clearScreen();
                    System.out.println("What type of room would you like to add?"
                            + "\n" + "Press 1 to add a Budget Room"
                            + "\n" + "Press 2 to add a Mid Class Room"
                            + "\n" + "Press 3 to add a Pent House Room");
                    String addChoice = scanner.nextLine();
                    if (addChoice.equals("1")) {
                        clearScreen();
                        System.out.println("Adding a Budget Room" + "\n" + "\n"
                                + "\n" + "Please state the name of the room:");
                        String name = scanner.nextLine();
                        System.out.println("Please state how mane beds are in the room:");
                        int room = scanner.nextInt();
                        System.out.println("Please state if there is a frenchbed inthe room:");
                        Boolean frenchBed = scanner.nextBoolean();
                        System.out.println("Please state the cost of the room:");
                        int cost = scanner.nextInt();
                        System.out.println("Please state if there is a blcony in the room:");
                        Boolean balchony = scanner.nextBoolean();
                        hotelManager.addBudgetRoom(name, room, frenchBed, cost, balchony);
                        clearScreen();
                        System.out.println("Budget Room has been added.");
                        pressAButton();
                    } else if (addChoice.equals("2")) {
                        clearScreen();
                        System.out.println("Adding a Mid Class Room" + "\n" + "\n"
                                + "\n" + "Please state the name of the room:");
                        String name = scanner.nextLine();
                        System.out.println("Please state how mane beds are in the room:");
                        int room = scanner.nextInt();
                        System.out.println("Please state if there is a frenchbed inthe room:");
                        Boolean frenchBed = scanner.nextBoolean();
                        System.out.println("Please state the cost of the room:");
                        int cost = scanner.nextInt();
                        System.out.println("Please state if there is a blcony in the room:");
                        Boolean balchony = scanner.nextBoolean();
                        hotelManager.addMidClassRoom(name, room, frenchBed, cost, balchony);
                        clearScreen();
                        System.out.println("Mid Class Room has been added.");
                        pressAButton();
                    } else if (addChoice.equals("3")) {
                        clearScreen();
                        System.out.println("Adding a Pent House Room" + "\n" + "\n"
                                + "\n" + "Please state the name of the room:");
                        String name = scanner.nextLine();
                        System.out.println("Please state how mane beds are in the room:");
                        int room = scanner.nextInt();
                        System.out.println("Please state if there is a frenchbed inthe room:");
                        Boolean frenchBed = scanner.nextBoolean();
                        System.out.println("Please state the cost of the room:");
                        int cost = scanner.nextInt();
                        System.out.println("Please state if there is a blcony in the room:");
                        Boolean balchony = scanner.nextBoolean();
                        hotelManager.addPentHouseRoom(name, room, frenchBed, cost, balchony);
                        clearScreen();
                        System.out.println("Pent House Room has been added.");
                        pressAButton();
                    } else throw new NoSuchMenuPointException("There is no menu point assigned to this number!");
                } else if (listChoice.equals("2")) {
                    clearScreen();
                    System.out.println("Please state the name of the new employee:");
                    String name = scanner.nextLine();
                    hotelManager.addEmployee(name);
                } else if (listChoice.equals("3")) {
                    clearScreen();
                } else throw new NoSuchMenuPointException("There is no menu point assigned to this number!");

            } else if (menuChoice.equals("3")) {

            } else if (menuChoice.equals("4")) {

            } else if (menuChoice.equals("0")) {
                clearScreen();
                System.out.println("Thank you for using the Hotel Gazeebo Hotelmanager Beta app!"
                        + "\n" + "Have a great day!");
                break;
            } else throw new NoSuchMenuPointException("There is no menu point assigned to this number!");
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