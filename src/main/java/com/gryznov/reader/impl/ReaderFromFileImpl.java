package com.gryznov.reader.impl;

import com.gryznov.exception.ReaderExeption;
import com.gryznov.reader.ReaderFromFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderFromFileImpl implements ReaderFromFile {
    @Override
    public List<String> readFile(String pathToFile) throws ReaderExeption {
        List<String> fileNumbers = new ArrayList<String>();

        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))){
            String currentLine;
            while((currentLine = reader.readLine()) != null){
                fileNumbers.add(currentLine);
            }
        } catch(FileNotFoundException e){
            throw new ReaderExeption("File " + pathToFile + "wasn't found");
        } catch (IOException e){
            throw new ReaderExeption("IO exception while reading this file");
        }
        return fileNumbers;
    }
}
