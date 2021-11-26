package com.pb.hw10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test NumBox integer: ");
        NumBox<Integer> intArr = new NumBox<>(3);
        intArr.add(20);
        intArr.add(36);
        intArr.add(64);
        intArr.add(90);
        System.out.println("result length: " + intArr.length());
        System.out.println("result sum: " + intArr.sum());
        System.out.println("result average: " + intArr.average());
        System.out.println("result max value: " + intArr.max());
        System.out.println("/*----------------------------------*/");
        System.out.println("Test NumBox float: ");
        NumBox<Float> floats = new NumBox<>(4);
        floats.add(2.27f);
        floats.add(1.5f);
        floats.add(3.5f);
        floats.add(0.73f);
        System.out.println("result length: " + floats.length());
        System.out.println("result sum: " + floats.sum());
        System.out.println("result average: " + floats.average());
        System.out.println("result max value: " + floats.max());
    }
}
