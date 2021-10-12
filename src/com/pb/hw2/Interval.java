package com.pb.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        String successResult = "Interval your number is ";

        System.out.println("Input number for the search interval: ");
        number = scan.nextInt();

        if (number >= 0 && number <= 14) {
            System.out.println(successResult + "[0 - 14]");
        } else if (number >= 15 && number <= 35) {
            System.out.println(successResult + "[15 - 35]");
        } else if (number >= 36 && number <= 50) {
            System.out.println(successResult + "[36 - 50]");
        } else if (number >= 51 && number <= 100) {
            System.out.println(successResult + "[51 - 100]");
        } else {
            System.out.println("Interval not found!");
        }
    }
}
