package com.sber.dto;

import java.util.ArrayList;
import java.util.List;


/**
 * Class that describes test data format
 * @author Dmitriy Dolgosheev
 * @version 1.0
 **/
public class TestDataDto {
    List<Integer> listOfA = new ArrayList<>();
    List<Integer> listOfB = new ArrayList<>();
    List<Integer> listOfK = new ArrayList<>();
    int numOfTests;

    public void setNumOfTests(int numOfTests) {
        this.numOfTests = numOfTests;
    }

    public List<Integer> getListOfA() {
        return listOfA;
    }

    public List<Integer> getListOfB() {
        return listOfB;
    }

    public List<Integer> getListOfK() {
        return listOfK;
    }

    public int getNumOfTests() {
        return numOfTests;
    }

    public void addToListOfA(int a) {
        this.listOfA.add(a);
    }

    public void addToListOfB(int b) {
        this.listOfB.add(b);
    }

    public void addToListOfK(int k) {
        this.listOfK.add(k);
    }

    // Just to test if everything is fine
    @Override
    public String toString() {
        return "TestDataDto{" +
                "listOfA=" + listOfA +
                ", listOfB=" + listOfB +
                ", listOfK=" + listOfK +
                ", numOfTests=" + numOfTests +
                '}';
    }
}
