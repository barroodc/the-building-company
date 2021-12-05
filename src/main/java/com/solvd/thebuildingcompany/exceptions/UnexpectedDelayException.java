package com.solvd.thebuildingcompany.exceptions;

import com.solvd.thebuildingcompany.enums.LevelOfDifficulty;

public class UnexpectedDelayException extends Exception {

    public UnexpectedDelayException(){
        super("Due to unforeseen circumstances the project has been delayed");
    }

    public UnexpectedDelayException(final String warning) {
        super(warning);
    }


    public UnexpectedDelayException(String s, LevelOfDifficulty hard) {
    }
}
