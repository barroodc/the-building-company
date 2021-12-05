package com.solvd.thebuildingcompany.exceptions;

import com.solvd.thebuildingcompany.enums.MaterialDelivery;

public class InsufficientMaterialsException extends Exception {

    public InsufficientMaterialsException() {
        super("More materials needed before moving forward");
    }

    public InsufficientMaterialsException(final String warning) {
        super(warning);
    }

    public InsufficientMaterialsException(String ordered_supplies_needed, MaterialDelivery ordered) {
    }
}
