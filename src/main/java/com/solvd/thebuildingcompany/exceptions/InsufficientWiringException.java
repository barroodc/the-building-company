package com.solvd.thebuildingcompany.exceptions;

import com.solvd.thebuildingcompany.enums.Location;

public class InsufficientWiringException extends Exception{

    public InsufficientWiringException() {
        super("Not enough wiring added internally throughout the home");
    }

    public InsufficientWiringException(final String warning){
        super(warning);
    }

    public InsufficientWiringException(String s, Location newJersey) {
    }
}
