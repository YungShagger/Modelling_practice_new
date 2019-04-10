package com.mycompany.app;

import com.mycompany.app.exception.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {

    private Map<Integer, BudgetRoom> budgetRooms = new HashMap<>();
    private Map<Integer, MidClassRoom> midClassRooms = new HashMap<>();
    private Map<Integer, PentHouseRoom> pentHouseRooms = new HashMap<>();


    private static int nextId = 0;

    public List<BudgetRoom> getBudgetRooms() {
        return new ArrayList<>(budgetRooms.values());
    }
    public List<MidClassRoom> getMidClassRooms() {
        return new ArrayList<>(midClassRooms.values());
    }
    public List<PentHouseRoom> getPentHouseRooms() {
        return new ArrayList<>(pentHouseRooms.values());
    }


    public MidClassRoom findMidClassRoomById(int inputId) throws InvalidRoomIdException {
        for (MidClassRoom midClassRoom : getMidClassRooms()) {
            if (Integer.parseInt(String.valueOf(midClassRoom)) == inputId) {
                return midClassRoom;
            }
        }
        throw new InvalidRoomIdException("There is no room assigned to the given ID");
    }
    public BudgetRoom findBudgetRoomById(int inputId) throws InvalidRoomIdException {
        for (BudgetRoom budgetRoom : getBudgetRooms()) {
            if (Integer.parseInt(String.valueOf(budgetRoom)) == inputId) {
                return budgetRoom;
            }
        }
        throw new InvalidRoomIdException("There is no room assigned to the given ID");
    }
    public PentHouseRoom findPentHouseRoomById(int inputId) throws InvalidRoomIdException {
        for (PentHouseRoom pentHouseRoom : getPentHouseRooms()) {
            if (Integer.parseInt(String.valueOf(pentHouseRoom)) == inputId) {
                return pentHouseRoom;
            }
        }
        throw new InvalidRoomIdException("There is no room assigned to the given ID");
    }

    public Room findRoomById(int inputId) throws InvalidRoomIdException {
        for (BudgetRoom budgetRoom : getBudgetRooms()) {
            if (Integer.parseInt(String.valueOf(budgetRoom)) == inputId) {
                return budgetRoom;
            }
        }
        for (MidClassRoom midClassRoom : getMidClassRooms()) {
            if (Integer.parseInt(String.valueOf(midClassRoom)) == inputId) {
                return midClassRoom;
            }
        }
        for (PentHouseRoom pentHouseRoom : getPentHouseRooms()) {
            if (Integer.parseInt(String.valueOf(pentHouseRoom)) == inputId) {
                return pentHouseRoom;
            }
        }
        throw new InvalidRoomIdException("There is no room assigned to the given ID");
    }


    public List<Room> getRentedRooms() {
        return new ArrayList<>();
    }


    public void addBudgetRoom(String name, int capacity, Boolean frenchBed, int cost, Boolean balchony) {
        BudgetRoom budgetRoom = new BudgetRoom(name, ++nextId, capacity, frenchBed, cost, balchony, true, true);
        budgetRooms.put(budgetRoom.getRoomId(), budgetRoom);
    }

    public void addMidClassRoom(String name, int capcity, Boolean frenchBed, int cost, Boolean balchony) {
        MidClassRoom midClassRoom = new MidClassRoom(name, ++nextId, capcity, frenchBed, cost, balchony,true, true);
        midClassRooms.put(midClassRoom.getRoomId(), midClassRoom);
    }

    public void addPentHouseRoom(String name, int capcity, Boolean frenchBed, int cost, Boolean balchony) {
        PentHouseRoom pentHouseRoom = new PentHouseRoom(name, ++nextId, capcity, frenchBed, cost, balchony,true, true);
        pentHouseRooms.put(pentHouseRoom.getRoomId(), pentHouseRoom);
    }

    public void rent(Customer customer, Room room, int days) throws HotelException{
        chechIfRoomIsOccupied(room);
        checkIfRoomIsClean(room);
        System.out.println("\n" + "Renteable and clean.");
        checkCustomerMoney(customer, room, days);
        checkRoomCapacity(customer, room);
        checkRoomBalchony(customer, room);
        checkFrenchBed(customer, room);

    }

    private void checkCustomerMoney(Customer customer,Room room, int days) throws NotEnoughMoneyException {
        int totalFee = room.getCost() * days;
        if (customer.getMoney() < totalFee) {
            throw new NotEnoughMoneyException("\n" + "Customer dont have enough money for this room.");
        }
        else {
            System.out.println("\n" + "Have the money to rent the room for " + days + " days.");
        }
    }

    private void checkRoomCapacity(Customer customer, Room room) throws NotEnoughBedsException{
        if (customer.getBedsNeeded() > room.getCapacity()) {
            throw new NotEnoughBedsException("\n" + "Not enough bed for the customer.");
        }
        else if (customer.getBedsNeeded() < room.getCapacity()) {
            int bedDiference = room.capacity - customer.getBedsNeeded();
            System.out.println("\n" + "There are " + bedDiference + " more beds then needed.");
        }
        else {
            System.out.println("\n" + "The amount of beds are perfect.");
        }
    }

    private void checkRoomBalchony(Customer customer, Room room) throws NoBalchonyExpection{
        if (customer.getBalchonyNeeded().equals(false) && room.getBalchony().equals(true)) {
            System.out.println("\n" + "there is a balcony when not needed");
        }
        else if (customer.getBalchonyNeeded().equals(true) && room.getBalchony().equals(false)) {
            throw new NoBalchonyExpection("\n" + "There is no balchony, but its needed.");
        }
        else {
            System.out.println("The balchony state of the room is as required.");
        }
    }

    private void checkFrenchBed(Customer customer, Room room) throws NoFrenchBedException {
        if (customer.getFrenchBedNeeded().equals(true) && room.getFrenchBed().equals(false)) {
            throw new NoFrenchBedException("\n" + "There is no frenchbed in the room, but its needed.");
        }
        else if (customer.getFrenchBedNeeded().equals(false) && room.getFrenchBed().equals(true))  {
            System.out.println("\n" + "There is a french bed, but its not needed");
        }
        else {
            System.out.println("\n" + "The french bed state of the room is as required.");
        }
    }

    private void chechIfRoomIsOccupied(Room room) throws RoomIsOccupiedException {
        if (room.getRentable().equals(false)) {
            throw new RoomIsOccupiedException("The room is already occupied.");
        }
    }

    private void checkIfRoomIsClean(Room room) throws RoomIsNotCleanException {
        if (room.getCleaned().equals(false)) {
            throw new RoomIsNotCleanException("The room is not yet cleaned.");
        }
    }




}
