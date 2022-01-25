package com.gryznov.main;

import com.gryznov.exception.ParserException;
import com.gryznov.exception.ReaderException;
import com.gryznov.parser.StringToDoubleParser;
import com.gryznov.parser.impl.StringToDoubleParserImpl;
import com.gryznov.reader.ReaderFromFile;
import com.gryznov.reader.impl.ReaderFromFileImpl;
import com.gryznov.service.NumberService;
import com.gryznov.service.ServiceMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class CustomMain {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) throws ReaderException, ParserException {
        NumberService a = new ServiceMethods();
        StringToDoubleParser parser = new StringToDoubleParserImpl();
        ReaderFromFile strArray = new ReaderFromFileImpl();
        List<String> finalArr = strArray.readFile("src\\main\\resources\\inititialnumbers\\numbers");
        logger.info(finalArr);
        logger.info(parser.parseAll(finalArr));




    }
}
