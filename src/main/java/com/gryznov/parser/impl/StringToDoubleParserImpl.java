package com.gryznov.parser.impl;

import com.gryznov.exception.ParserException;
import com.gryznov.parser.StringToDoubleParser;
import com.gryznov.validator.StringValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StringToDoubleParserImpl implements StringToDoubleParser {
    static Logger logger = LogManager.getLogger();
    @Override
    public List<Double> parseAll(List<String> strList) throws ParserException {
        List<Double> doubleList = new ArrayList<Double>();
        boolean isUncorrectData = false;

        if(!strList.isEmpty()){
            for(String currentLine : strList){
                if(StringValidator.validate(currentLine)){
                    Double temp = Double.valueOf(currentLine);
                    doubleList.add(temp);
                }else{
                    isUncorrectData = true;
                }
            }
        }
        return doubleList;
    }

}