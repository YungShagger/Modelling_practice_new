package com.mycompany.app;

import com.mycompany.app.exception.HotelException;

public class BudgetRoom extends Room {

    public BudgetRoom(String name, int roomId, int capacity, Boolean frenchBed, int cost, Boolean balchony, Boolean rentable, Boolean cleaned) {
        super(name, roomId, capacity, frenchBed, cost, balchony, rentable, cleaned);
    }

    @Override
    public void clean(Employee employee, Room room) throws HotelException {
        if (employee.getWorking().equals(false)) {
            throw new HotelException(employee.getName() + " can't clean the room " + room.getRoomId() + ", due to him not at work currently.");
        } else if (employee.getOnBreak().equals(true)) {
            throw new HotelException(employee.getName() + " can't clean the room " + room.getRoomId() + ", due to him is on a break currently.");
        } else if (room.getCleaned().equals(true)) {
            throw new HotelException(employee.getName() + "can't clean the room " + room.getRoomId() + ", due to the room has been already cleaned.");
        } else {
            room.setCleaned(true);
            System.out.println("The room " + room.getRoomId() + " has been successfuly cleaned.");
        }
    }
}
