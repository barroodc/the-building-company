package com.solvd.thebuildingcompany.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ApacheWordCount {

    private static final Logger logger = LogManager.getLogger(ApacheWordCount.class);

    public static void uniqueWordFunction() throws IOException {
        final Path path = Paths.get("src/main/resources/apachecalc.txt");
        final String str = String.valueOf(Files.readAllLines(path));
        final String s = str.replaceAll("\\p{Punct}", "");
        String[] splits = s.split("\\s");
        HashMap<String, Integer> wordCount = new HashMap<>();
        Arrays.stream(splits).forEachOrdered(words -> {
            if (wordCount.containsKey(words)) {
                wordCount.put(words.toLowerCase(), wordCount.get(words) + 1);
            } else {
                wordCount.put(words, 1);
            }
        });
        String wordsOccurrences =  wordCount.toString().replace("[", "").replace("]", "");
        logger.info(wordsOccurrences);
    }

    /*public static void main(String[] args) throws IOException {
        uniqueWordFunction();
    }

     */
}

