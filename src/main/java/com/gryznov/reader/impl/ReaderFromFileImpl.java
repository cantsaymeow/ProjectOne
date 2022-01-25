package com.gryznov.reader.impl;

import com.gryznov.exception.ReaderException;
import com.gryznov.reader.ReaderFromFile;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderFromFileImpl implements ReaderFromFile {
    public static final String FILE_NOT_FOUND_EXCEPTION = "FileNotFoundException";
    public static final String IO_EXCEPTION = "IOException";
    static Logger logger = LogManager.getLogger();
    @Override
    public List<String> readFile(String pathToFile) {
        List<String> fileNumbers = new ArrayList<String>();

        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))){
            String currentLine;
            while((currentLine = reader.readLine()) != null){
                fileNumbers.add(currentLine);
            }
        } catch(FileNotFoundException e){
            logger.error(FILE_NOT_FOUND_EXCEPTION,e);
        } catch (IOException e){
            logger.error(IO_EXCEPTION,e);
        }
        return fileNumbers;
    }
}
