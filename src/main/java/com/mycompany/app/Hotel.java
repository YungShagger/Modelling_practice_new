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



    // Find room by Id!
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

    public void rent(Customer customer, Room room) throws HotelException {
        chechIfRoomIsOccupied(room);
        checkIfRoomIsClean(room);
        checkCustomerMoney(customer, room);
        checkRoomCapacity(customer, room);
        checkRoomBalchony(customer,room);
        checkFrenchBed(customer, room);
        room.setRentable(false);

    }

    private void checkCustomerMoney(Customer customer,Room room) throws NotEnoughMoneyException {
        if (customer.getMoney() < room.getCost()) {
            throw new NotEnoughMoneyException("Customer dont have enough money for this room.");
        }
    }
    private void checkRoomCapacity(Customer customer, Room room) throws NotEnoughBedsException, TooMuchBedsException{
        if (customer.getBedsNeeded() > room.getCapacity()) {
            throw new NotEnoughBedsException("Not enough bed for the customer.");
        }
        else if (customer.getBedsNeeded() < room.getCapacity()) {
            throw new TooMuchBedsException("Too much bed for the customer.");
        }
    }
    private void checkRoomBalchony(Customer customer, Room room) throws NoBalchonyExpection, BalchonyException {
        if (customer.getBalchonyNeeded().equals(false) && room.getBalchony().equals(true)) {
            throw new BalchonyException("There is a balchony, but its not needed.");
        }
        else if (customer.getBalchonyNeeded().equals(true) && room.getBalchony().equals(false)) {
            throw new NoBalchonyExpection("There is no balchony, but its needed.");
        }
    }
    private void checkFrenchBed(Customer customer, Room room) throws FrenchBedException, NoFrenchBedException {
        if (customer.getFrenchBedNeeded().equals(true) && room.getFrenchBed().equals(false)) {
            throw new NoFrenchBedException("There is no frenchbed i nthe room, but its needed.");
        }
        else if (customer.getFrenchBedNeeded().equals(false) && room.getFrenchBed().equals(true))  {
           throw new FrenchBedException("There is a frenchbed in the room, but its not desired.");
        }
    }
    private void chechIfRoomIsOccupied(Room room) throws RoomIsOccupiedException {
        if (room.getRentable().equals(false)) {
            throw new RoomIsOccupiedException("The room is already occupied");
        }
    }
    private void checkIfRoomIsClean(Room room) throws RoomIsNotCleanException {
        if (room.getCleaned().equals(false)) {
            throw new RoomIsNotCleanException("The room is not yet cleaned");
        }
    }




}
