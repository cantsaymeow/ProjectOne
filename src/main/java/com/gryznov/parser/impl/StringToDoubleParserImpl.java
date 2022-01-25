package com.gryznov.parser.impl;

import com.gryznov.exception.ParserException;
import com.gryznov.parser.StringToDoubleParser;
import com.gryznov.validator.StringValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StringToDoubleParserImpl implements StringToDoubleParser {
    public static final String NUMBER_FORMAT_EXCEPTION = "NumberFormatException";
    static Logger logger = LogManager.getLogger();
    @Override
    public List<Double> parseAll(List<String> strList) throws ParserException {
        List<Double> doubleList = new ArrayList<>();
        for (int i = 0; i < strList.size(); i++) {
            try{
                doubleList.add(Double.parseDouble(strList.get(i)));
            }
            catch(NumberFormatException e){
                logger.error(NUMBER_FORMAT_EXCEPTION);
            }
        }
        return doubleList;
    }

}