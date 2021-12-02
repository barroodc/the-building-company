package com.solvd.thebuildingcompany.exceptions;

public class InvalidLotException extends Exception {

    public InvalidLotException(){
        super("Lot can not be built on");
    }

    public InvalidLotException(String warning){
        super(warning);
    }
}
