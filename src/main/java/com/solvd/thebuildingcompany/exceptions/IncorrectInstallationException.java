package com.solvd.thebuildingcompany.exceptions;

public class IncorrectInstallationException extends Exception {

    public IncorrectInstallationException() {
        super("Installed incorrectly. Please reinstall");
    }

    public IncorrectInstallationException(String warning){
        super(warning);
    }
}
