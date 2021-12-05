package com.solvd.thebuildingcompany.inspectors;

public abstract class Inspector {

    private String name;

    public Inspector() {

    }

    public Inspector(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    protected abstract void generalInspection();
}
