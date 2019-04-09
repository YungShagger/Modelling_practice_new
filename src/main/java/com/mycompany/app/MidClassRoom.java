package com.mycompany.app;

import com.mycompany.app.exception.HotelException;

public class MidClassRoom extends Room {

    public MidClassRoom(String name, int roomId, int capacity, Boolean frenchBed, int cost, Boolean balchony, Boolean rentable, Boolean cleaned) {
        super(name, roomId, capacity, frenchBed, cost, balchony, rentable, cleaned);
    }

    @Override
    public void clean(Employee employee) throws HotelException {
        if (employee.getWorking().equals(false)) {
            throw new HotelException(employee.getName() + " can't clean the room " + getRoomId() + ", due to him not at work currently.");
        } else if (employee.getOnBreak().equals(true)) {
            System.out.println(employee.getName() + " is currently on a break but since the room" + getRoomId() + "is a middle class room,"
                    + "\n" + "the cleaning takes priority. " + employee.getName() + "is currently being called back from the break.");
            employee.setOnBreak(false);
        } else if (getCleaned().equals(true)) {
            throw new HotelException(employee.getName() + "can't clean the room " + getRoomId() + ", due to the room has been already cleaned.");
        } else {
            setCleaned(true);
            System.out.println("The room " + getRoomId() + " has been successfuly cleaned.");
        }
    }
}
