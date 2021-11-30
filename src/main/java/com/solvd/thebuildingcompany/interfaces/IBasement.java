package com.solvd.thebuildingcompany.interfaces;

import com.solvd.thebuildingcompany.Inspections;
import org.apache.log4j.spi.LoggerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface IBasement {
    Logger logger = LogManager.getLogger(IBasement.class);

    void addBasement();
}
