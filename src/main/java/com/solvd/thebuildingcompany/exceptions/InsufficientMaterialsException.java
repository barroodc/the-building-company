package com.solvd.thebuildingcompany.exceptions;

public class InsufficientMaterialsException extends Exception {

    public InsufficientMaterialsException() {
        super("More materials needed before moving forward");
    }

    public InsufficientMaterialsException(String warning) {
        super(warning);
    }
}
