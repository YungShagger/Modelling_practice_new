import com.mycompany.app.Customer;
import com.mycompany.app.Employee;
import com.mycompany.app.Hotel;
import com.mycompany.app.Room;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Employee> employees = new ArrayList<>();
    private static List<Customer> customers = new ArrayList<>();
    private static Hotel hotel = new Hotel();

    public static void main(String[] args){


        hotel.addRoom("room1",4,false,80,true);
        hotel.addRoom("room2",2,true,40,true);
        hotel.addRoom("room3",2,false,30,false);
        hotel.addRoom("room4",3,true,50,false);
        hotel.addRoom("room5",6,false,100,true);
        hotel.addRoom("room6",2,true,40,true);
        hotel.addRoom("room6",5,false,60,true);
        hotel.addRoom("room7",1,false,20,true);
        hotel.addRoom("room8",8,true,120,true);

        employees.add(new Employee("Andrew",true, false));
        employees.add(new Employee("Vanessa",true,true));
        employees.add(new Employee("Hyun",false,true));
        employees.add(new Employee("Samanta", true,false));

        customers.add(new Customer("Sonny", 100,4,true,true));
        customers.add(new Customer("Ashley", 50,2,true,false));
        customers.add(new Customer("Linda",40,3,false,false));
        customers.add(new Customer("mike",200,2,true,true));
        customers.add(new Customer("Andy",50,1,false,false));

        printRooms();
        printEmployees();
        printCustomers();


        }
    private static void printRooms() {
        for (Room room : hotel.getRooms()) {
            System.out.println(room);
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