package com.solvd.thebuildingcompany.exceptions;

public class UnexpectedDelayException extends Exception {

    public UnexpectedDelayException(){
        super("Due to unforeseen circumstances the project has been delayed");
    }

    public UnexpectedDelayException(String warning) {
        super(warning);
    }
}
