package com.gryznov.parser;

import com.gryznov.exception.ParserException;

import java.text.ParseException;
import java.util.List;

public interface StringToDoubleParser {
    public List<Double> parseAll(List<String> strList) throws ParserException;
}
