package com.pb.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randNumber = random.nextInt(max - min + 1) + min;
        int customNumber;
        String command;

        int counter = 0;
        while (true) {
            counter++;
            System.out.println("Enter your number (to exit enter \"exit\"): ");
            if (scanner.hasNextInt()) {
                customNumber = scanner.nextInt();
                if (customNumber > randNumber) {
                    System.out.println("Your number is greater than expected!");
                } else if (customNumber < randNumber) {
                    System.out.println("Your number is less than expected!");
                } else if (customNumber == randNumber) {
                    System.out.println("Congratulations, you guessed the number!");
                    System.out.println("Number of attempts to guess the number: " + counter);
                    break;
                } else {
                    System.out.println("Undefined result");
                }
            } else {
                command = scanner.next();
                if (command.equals("exit")) {
                    System.out.println("Game over!");
                    break;
                } else {
                    System.out.println("You have not entered an integer! Please enter a whole number!");
                }
            }
        }
    }
}