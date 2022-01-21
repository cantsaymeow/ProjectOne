package com.gryznov.entity;

public class CustomArray {
    private double[] initialArr;

    public CustomArray(int size){
        initialArr = new double[size];
    }

    public CustomArray(double[] initialArr){
        this.initialArr = initialArr;
    }

    public double[] getInitialArr() {
        return initialArr;
    }

    public void setInitialArr(double[] initialArr) {
        this.initialArr = initialArr;
    }
}
