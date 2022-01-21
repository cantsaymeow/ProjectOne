package com.gryznov.parser.impl;

import com.gryznov.exception.ParserException;
import com.gryznov.parser.StringToDoubleParser;

import java.util.ArrayList;
import java.util.List;

public class StringToDoubleParserImpl implements StringToDoubleParser {
    @Override
    public List<Double> parseAll(List<String> strList) throws ParserException {
        List<Double> doubleList = new ArrayList<Double>();

        boolean isUncorrectData = false;

        if (!strList.isEmpty()) {
            for (String currentLine : strList) {
            }
        }
        return new ArrayList<>();
    }
}
