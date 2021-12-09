package com.solvd.thebuildingcompany.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Worker {
    private static final Logger logger = LogManager.getLogger(Worker.class);

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker(final String name){
        this.name = name;
    }

    public synchronized void beginMorningShift(Worker worker){
        logger.info(worker.getName() + " is waiting on the night shift worker Peter to end his shift.");
    }

    public synchronized void beginNightShift(Worker worker) {
        logger.info(worker.getName() + " is waiting on the day shift worker Josh to end his shift.");
    }
}
