package com.solvd.thebuildingcompany.exceptions;

import com.solvd.thebuildingcompany.enums.StageOfTask;

public class InvalidLotException extends Exception {

    public InvalidLotException(){
        super("Lot can not be built on");
    }

    public InvalidLotException(final String warning){
        super(warning);
    }

    public InvalidLotException(String s, StageOfTask midwayThrough) {
    }
}
