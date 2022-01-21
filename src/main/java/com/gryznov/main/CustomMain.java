package com.gryznov.main;
import com.gryznov.exception.ReaderExeption;
import com.gryznov.reader.ReaderFromFile;
import com.gryznov.reader.impl.ReaderFromFileImpl;

import java.util.List;

public class CustomMain {
    public static void main(String[] args) throws ReaderExeption {
        ReaderFromFile strArray = new ReaderFromFileImpl();
        List<String> finalArr = strArray.readFile("src\\main\\resources\\inititialnumbers\\numbers");
        System.out.println(finalArr);


    }
}
