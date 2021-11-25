package com.pb.hw10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test NumBox integer: ");
        NumBox<Integer> intArr = new NumBox<>(3);
        intArr.add(100);
        intArr.add(2);
        intArr.add(43);
        intArr.add(64);
        System.out.println("result length: " + intArr.length());
        System.out.println("result sum: " + intArr.sum());
        System.out.println("result average: " + intArr.average());
        System.out.println("result max value: " + intArr.max());

        System.out.println("Test NumBox float: ");
        NumBox<Float> floats = new NumBox<>(4);
        floats.add(2.5f);
        floats.add(1.2f);
        floats.add(3.4f);
        floats.add(0.1f);
        System.out.println("result length: " + floats.length());
        System.out.println("result sum: " + floats.sum());
        System.out.println("result average: " + floats.average());
        System.out.println("result max value: " + floats.max());
    }
}
