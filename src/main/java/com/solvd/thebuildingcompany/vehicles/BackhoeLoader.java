package com.solvd.thebuildingcompany.vehicles;

import com.solvd.thebuildingcompany.interfaces.IDig;
import com.solvd.thebuildingcompany.interfaces.IDrivable;
import com.solvd.thebuildingcompany.interfaces.IPave;

public class BackhoeLoader extends Vehicle implements IDrivable, IDig, IPave {


    public BackhoeLoader(String nameOfVehicle) {
        super(nameOfVehicle);
    }

    @Override
    public void dig() {

    }

    @Override
    public void pave() {

    }

    @Override
    public void drive() {

    }
}
