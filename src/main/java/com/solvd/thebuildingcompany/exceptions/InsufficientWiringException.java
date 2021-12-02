package com.solvd.thebuildingcompany.exceptions;

public class InsufficientWiringException extends Exception{

    public InsufficientWiringException() {
        super("Not enough wiring added internally throughout the home");
    }

    public InsufficientWiringException(String warning){
        super(warning);
    }
}
