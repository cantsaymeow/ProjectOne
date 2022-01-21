package com.gryznov.reader;


import com.gryznov.exception.ReaderExeption;

import java.util.List;

public interface ReaderFromFile {
    public List<String> readFile (String pathToFile) throws ReaderExeption;
}
