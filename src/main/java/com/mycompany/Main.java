import com.mycompany.app.exception.NoSuchMenuPointException;
import com.mycompany.app.*;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    private static HotelManager hotelManager = new HotelManager();
    public static void main(String[] args) throws NoSuchMenuPointException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to HOTEL GAZEEBO!"
                    + "\n" + "\n" + "\n" + "How may I help you ?"
                    + "\n" + "Press 1 for the LISTING"
                    + "\n" + "Press 2 for the ADDING"
                    + "\n" + "Press 3 for the CLEANIN"
                    + "\n" + "Press 4 to CHECK EMPLOYEES"
                    + "\n" + "5:  ");
        String menuChoice = scanner.nextLine();
        if (menuChoice.equals("1")){
            clearScreen();
            System.out.printf("What would you like to list out?"
                    + "\n" + "Press 1 to list ROOMS"
                    + "\n" + "Press 2 to list Employees"
                    + "\n" + "Press 3 to list Customers");
            String listChoice = scanner.nextLine();
            if (listChoice.equals("1")) {
                clearScreen();
                hotelManager.callPrintRooms();
            } else if (listChoice.equals("2")) {
                clearScreen();
                hotelManager.callPrintEmployees();
            } else if (listChoice.equals("3")) {
                clearScreen();
                hotelManager.callPrintCustomers();
            } else throw new NoSuchMenuPointException("There is no menu point assigned to this number!");
        } else if (menuChoice.equals("2")) {
            clearScreen();
            System.out.printf("What would you like to add the the system?"
                    + "\n" + "Press 1 to add a Room"
                    + "\n" + "Press 2 to add an Employee"
                    + "\n" + "Press 3 to add a Customer");
            String listChoice = scanner.nextLine();
            if (listChoice.equals("1")) {
                clearScreen();
                System.out.printf("What type of room would you like to add?"
                        + "\n" + "Press 1 to add a Budget Room"
                        + "\n" + "Press 2 to add a Mid Class Room"
                        + "\n" + "Press 3 to add a Pent House Room");
                String addChoice = scanner.nextLine();
                if (addChoice.equals("1")) {
                    clearScreen();
                    System.out.printf("Adding a Budget Room" + "\n" + "\n"
                                    + "\n" + "Please state the name of the room:");
                    String name = scanner.nextLine();
                    System.out.printf("Please state how mane beds are in the room:");
                    int room = scanner.nextInt();
                    System.out.printf("Please state if there is a frenchbed inthe room:");
                    Boolean frenchBed = scanner.nextBoolean();
                    System.out.printf("Please state the cost of the room:");
                    int cost = scanner.nextInt();
                    System.out.printf("Please state if there is a blcony in the room:");
                    Boolean balchony = scanner.nextBoolean();
                    hotelManager.callAddBudgetRoom(name, room, frenchBed, cost, balchony);
                } else if (addChoice.equals("2")) {
                    clearScreen();
                    System.out.printf("Adding a Mid Class Room" + "\n" + "\n"
                            + "\n" + "Please state the name of the room:");
                    String name = scanner.nextLine();
                    System.out.printf("Please state how mane beds are in the room:");
                    int room = scanner.nextInt();
                    System.out.printf("Please state if there is a frenchbed inthe room:");
                    Boolean frenchBed = scanner.nextBoolean();
                    System.out.printf("Please state the cost of the room:");
                    int cost = scanner.nextInt();
                    System.out.printf("Please state if there is a blcony in the room:");
                    Boolean balchony = scanner.nextBoolean();
                    hotelManager.callAddMidClassRoom(name, room, frenchBed, cost, balchony);
                } else if (addChoice.equals("3")) {
                    clearScreen();
                    System.out.printf("Adding a Pent House Room" + "\n" + "\n"
                            + "\n" + "Please state the name of the room:");
                    String name = scanner.nextLine();
                    System.out.printf("Please state how mane beds are in the room:");
                    int room = scanner.nextInt();
                    System.out.printf("Please state if there is a frenchbed inthe room:");
                    Boolean frenchBed = scanner.nextBoolean();
                    System.out.printf("Please state the cost of the room:");
                    int cost = scanner.nextInt();
                    System.out.printf("Please state if there is a blcony in the room:");
                    Boolean balchony = scanner.nextBoolean();
                    hotelManager.callAddPentHouseRoom(name, room, frenchBed, cost, balchony);
                } else throw new NoSuchMenuPointException("There is no menu point assigned to this number!");
            } else if (listChoice.equals("2")) {
                clearScreen();
            } else if (listChoice.equals("3")) {
                clearScreen();
            } else throw new NoSuchMenuPointException("There is no menu point assigned to this number!");

        } else if (menuChoice.equals("3")) {

        } else if (menuChoice.equals("4")) {

        } else throw new NoSuchMenuPointException("There is no menu point assigned to this number!");


    }

    private static void clearScreen() {
        System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n"
                + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n"
                + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
    }
}