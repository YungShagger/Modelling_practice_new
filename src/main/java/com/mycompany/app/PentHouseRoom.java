package com.mycompany.app;

import com.mycompany.app.exception.HotelException;

public class PentHouseRoom extends Room {

    public PentHouseRoom(String name, int roomId, int capacity, Boolean frenchBed, int cost, Boolean balchony, Boolean rentable, Boolean cleaned) {
        super(name, roomId, capacity, frenchBed, cost, balchony, rentable, cleaned);
    }

    @Override
    public void clean(Employee employee, Room room) throws HotelException {
        if (employee.getWorking().equals(false)) {
            System.out.println(employee.getName() + " is currently not at work, but since room " + room.getRoomId() + "is a pen house high class room,"
                    + "\n" + "the cleaning takes priority. " + employee.getName() + " is currently being called into work.");
            employee.setWorking(true);
        } else if (employee.getOnBreak().equals(true)) {
            System.out.println(employee.getName() + " is currently on a break but since the room" + room.getRoomId() + "is a middle class room,"
                    + "\n" + "the cleaning takes priority. " + employee.getName() + " is currently being called back from the break.");
            employee.setOnBreak(false);
        } else if (room.getCleaned().equals(true)) {
            throw new HotelException(employee.getName() + "can't clean the room " + room.getRoomId() + ", due to the room has been already cleaned.");
        } else {
            room.setCleaned(true);
            System.out.println("The room " + room.getRoomId() + " has been successfuly cleaned.");
        }
    }
}
