package com.mycompany.app.exception;

public class RoomIsOccupiedException extends HotelException {
    public RoomIsOccupiedException(String message) {
        super(message);
    }
}