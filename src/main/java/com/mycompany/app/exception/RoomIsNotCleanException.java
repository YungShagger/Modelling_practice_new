package com.mycompany.app.exception;

public class RoomIsNotCleanException extends HotelException {
    public RoomIsNotCleanException(String message) {
        super(message);
    }
}