package com.pb.hw4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string to update it to uppercase: ");

        String customString;
        customString = scanner.nextLine();

        System.out.println(upperCaseString(customString));
    }

    static String upperCaseString(String customString) {
        StringTokenizer customStringTokenizer = new StringTokenizer(customString, " ");
        String upperCaseCustomString = "";
        while (customStringTokenizer.hasMoreElements()) {
            upperCaseCustomString = upperCaseCustomString.concat(
                    upperCaseWord(customStringTokenizer.nextElement().toString())
            );
            if (customStringTokenizer.hasMoreElements()) {
                upperCaseCustomString = upperCaseCustomString.concat(" ");
            }
        }

        return upperCaseCustomString;
    }

    static String upperCaseWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
