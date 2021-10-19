package com.pb.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = new int[10];
        int counter = 0;
        while (counter < numbersArr.length) {
            System.out.println("Enter any integer (entered " + (counter + 1) + " of " + numbersArr.length + "): ");
            if (scanner.hasNextInt()) {
                numbersArr[counter] = scanner.nextInt();
                counter++;
            } else {
                scanner.next();
                System.out.println("You entered a non-integer number!");
            }
        }

        int arraySum = 0;
        int positiveNumbers = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            arraySum += numbersArr[i];
            if (numbersArr[i] > 0) {
                positiveNumbers++;
            }
        }

        System.out.println("Your array: " + Arrays.toString(numbersArr));
        System.out.println("Sum of array elements: " + arraySum);
        System.out.println("Number of positive elements: " + positiveNumbers);

        for (int i = 0; i < numbersArr.length; i++) {
            for (int j = 0; j < numbersArr.length - 1; j++) {
                if (numbersArr[j] > numbersArr[j + 1]) {
                    int number = numbersArr[j];
                    numbersArr[j] = numbersArr[j + 1];
                    numbersArr[j + 1] = number;
                }
            }
        }

        System.out.println("Your array: " + Arrays.toString(numbersArr));
    }
}