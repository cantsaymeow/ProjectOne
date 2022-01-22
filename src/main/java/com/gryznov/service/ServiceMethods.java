package com.gryznov.service;

import com.gryznov.entity.CustomArray;
import com.gryznov.exception.ReaderExeption;
import com.gryznov.reader.ReaderFromFile;
import com.gryznov.reader.impl.ReaderFromFileImpl;

import java.util.List;

public class ServiceMethods extends CustomArray implements ReaderFromFile {

    public ServiceMethods(int size) {
        super(size);
    }

    public ServiceMethods(double[] initialArr) {
        super(initialArr);
    }

    @Override
    public List<String> readFile(String pathToFile) throws ReaderExeption {
        return null;
    }
}
