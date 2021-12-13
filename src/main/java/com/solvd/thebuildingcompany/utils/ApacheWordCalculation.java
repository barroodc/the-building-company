package com.solvd.thebuildingcompany.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ApacheWordCalculation {
    private static final Logger logger = LogManager.getLogger(ApacheWordCalculation.class);

    public ApacheWordCalculation() {

    }

    public void uniqueWordCounter() {
        {
            try {
                final long uniqueWords = Files.lines(Paths.get("src/main/resources/apachecalc.txt"), Charset.defaultCharset()).flatMap(line -> Arrays.stream(line.split(" "))).distinct().count();
                logger.info(uniqueWords + " unique words exist in this file.");
            } catch (IOException e) {
                logger.error(e);
            }
        }
    }
   /* public static void main(String[] args) {
        final ApacheWordCalculation example = new ApacheWordCalculation();
        example.uniqueWordCounter();
    }

    */


}