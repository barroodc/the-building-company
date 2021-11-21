package com.solvd.thebuildingcompany.employees.humanresourceemployees;

import com.solvd.thebuildingcompany.departments.HumanResources;

import java.util.logging.Logger;

public class HumanResourceRecruiter extends HumanResources {

    private final Logger logger = Logger.getLogger(HumanResourceRecruiter.class.getName());

    public HumanResourceRecruiter(String name) {
        this.setName(name);
    }

    @Override
    protected String recruiting() {
        return null;
    }

    @Override
    protected String safeEnvironmentCheck() {
        return null;
    }

    @Override
    protected String employerEmployeeRelations() {
        return null;
    }

    @Override
    protected String compensationAndBenefits() {
        return null;
    }

    @Override
    protected String laborLawCompliance() {
        return null;
    }

    @Override
    protected String trainingAndDevelopment() {
        return null;
    }
}
