package com.Kelly.RecordsByDaylight.exception;

public class RequestNotFoundException extends RuntimeException{
    public RequestNotFoundException (String message){
        super(message);
    }
}
