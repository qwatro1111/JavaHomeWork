package com.pb.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int operandFirst;
        int operandSecond;
        String sign;

        System.out.println("Input first operand: ");
        operandFirst = scan.nextInt();
        System.out.println("Input second number: ");
        operandSecond = scan.nextInt();
        System.out.println("Input sign: ");
        sign = scan.next();

        switch (sign) {
            case "+":
                System.out.println("Result: " + (operandFirst + operandSecond));
                break;
            case "-":
                System.out.println("Result: " + (operandFirst - operandSecond));
                break;
            case "*":
                System.out.println("Result: " + (operandFirst * operandSecond));
                break;
            case "/":
                if (operandSecond != 0) {
                    System.out.println("Result: " + (operandFirst / operandSecond));
                } else {
                    System.out.println("You cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Sign not found!");
        }
    }
}
