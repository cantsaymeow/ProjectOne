package com.gryznov.exception;

import com.gryznov.reader.ReaderFromFile;

import java.lang.reflect.Executable;

public class ReaderExeption extends Exception {
    public ReaderExeption(){
        super();
    }

    public ReaderExeption(String message){
        super(message);
    }

    public ReaderExeption(Exception e){
        super(e);
    }

    public ReaderExeption(String message, Exception e){
        super(message,e);
    }
}
