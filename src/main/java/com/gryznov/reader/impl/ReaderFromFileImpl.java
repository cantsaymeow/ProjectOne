package com.gryznov.reader.impl;

import com.gryznov.exception.ReaderExeption;
import com.gryznov.reader.ReaderFromFile;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderFromFileImpl implements ReaderFromFile {
    static Logger logger = LogManager.getLogger();
    @Override
    public List<String> readFile(String pathToFile) throws ReaderExeption {
        List<String> fileNumbers = new ArrayList<String>();

        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))){
            String currentLine;
            while((currentLine = reader.readLine()) != null){
                fileNumbers.add(currentLine);
            }
        } catch(FileNotFoundException e){
            logger.error("FileNotFoundException",e);
        } catch (IOException e){
            logger.error("IOException",e);
        }
        return fileNumbers;
    }
}
