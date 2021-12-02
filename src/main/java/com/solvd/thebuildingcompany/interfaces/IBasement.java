package com.solvd.thebuildingcompany.interfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface IBasement {
    Logger logger = LogManager.getLogger(IBasement.class);

    void addBasement();
}
