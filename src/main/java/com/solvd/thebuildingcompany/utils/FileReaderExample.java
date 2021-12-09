package com.solvd.thebuildingcompany.utils;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FileReaderExample {

    private static final Logger logger = LogManager.getLogger(FileReaderExample.class);

    public FileReaderExample() {

    }

    public void convertingInputStreamToFile(){
        try{
            final InputStream startingStream = FileUtils.openInputStream(new File("src/main/resources/apachecalc.txt"));
            final File targetFile = new File("src/main/resources/apachecalc.tmp");
            FileUtils.copyInputStreamToFile(startingStream,targetFile);
        } catch (IOException e){
           logger.error(e);
        }
    }
}
