package com.gryznov.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {
    public static final String REGEX_DELIMETER = "\\s+";
    public static boolean validate(String parameter){
        Pattern pattern = Pattern.compile(REGEX_DELIMETER);
        Matcher matcher = pattern.matcher(parameter);

        return matcher.matches();
    }
}
