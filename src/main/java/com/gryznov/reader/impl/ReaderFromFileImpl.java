package com.gryznov.reader.impl;

import com.gryznov.exception.ReaderException;
import com.gryznov.reader.ReaderFromFile;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderFromFileImpl implements ReaderFromFile {
    public static final String FILE_NOT_FOUND_EXCEPTION = "FileNotFoundException";
    static Logger logger = LogManager.getLogger();

    @Override
    public List<String> readFile(String pathToFile) {
        List<String> fileNumbers = new ArrayList<String>();

        try {
            Scanner scanner = new Scanner(new File(pathToFile));
            while (scanner.hasNextLine()) {
                Scanner s2 = new Scanner(scanner.nextLine());
                while (s2.hasNextLine()) {
                    String s = s2.next();
                    fileNumbers.add(s);
                }
            }
        } catch (FileNotFoundException e) {
            logger.error(FILE_NOT_FOUND_EXCEPTION, e);
        }
        return fileNumbers;
    }
}
