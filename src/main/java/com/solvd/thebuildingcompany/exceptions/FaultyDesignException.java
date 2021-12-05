package com.solvd.thebuildingcompany.exceptions;

import com.solvd.thebuildingcompany.enums.Location;
import com.solvd.thebuildingcompany.enums.PriorityLevels;

public class FaultyDesignException extends Exception {

    public FaultyDesignException() {
       super("This part of the project needs careful resdesigning");
    }

    public FaultyDesignException(String warning) {
        super(warning);
    }

    public FaultyDesignException(String s, PriorityLevels highPriority) {
    }

}
