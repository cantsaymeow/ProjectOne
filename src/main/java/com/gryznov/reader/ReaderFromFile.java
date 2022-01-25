package com.gryznov.reader;


import com.gryznov.exception.ReaderException;

import java.util.List;

public interface ReaderFromFile {
    public List<String> readFile (String pathToFile) throws ReaderException;
}
