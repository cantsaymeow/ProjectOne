package com.gryznov.service;

import com.gryznov.entity.CustomArray;
import com.gryznov.exception.ReaderException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceMethods implements NumberService {
    public static final String ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION = "ArrayIndexOutOfBoundsException";
    static Logger logger = LogManager.getLogger();

    @Override
    public double findMax(double[] intArr) throws ArrayIndexOutOfBoundsException {
        double maxValue = 0;
        try {
            maxValue = intArr[0];
            for (double temp : intArr) {
                if (temp > maxValue) {
                    maxValue = temp;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error(ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION);
        }

        return maxValue;
    }

    @Override
    public double findMin(double[] intArr) throws ArrayIndexOutOfBoundsException {
        double minValue = 0;
        try {
            minValue = intArr[0];
            for (double temp : intArr) {
                if (temp < minValue) {
                    minValue = temp;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error(ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION);
        }

        return minValue;
    }

    @Override
    public double[] negToPos(double[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Math.abs(intArr[i]);
        }

        return intArr;
    }

    @Override
    public double sum(double[] intArr) {
        double sum = 0;
        for (double temp : intArr) {
            sum += temp;
        }
        return sum;
    }

    @Override
    public double numberPos(double[] intArr) {
        double pos = 0;
        for (double temp : intArr) {
            if (temp > 0) {
                pos += 1;
            }
        }
        return pos;
    }

    @Override
    public double numberNeg(double[] intArr) {
        double neg = 0;
        for (double temp : intArr) {
            if (temp < 0) {
                neg += 1;
            }
        }
        return neg;
    }
}
