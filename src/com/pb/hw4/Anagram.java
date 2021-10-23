package com.pb.hw4;

import com.pb.hw3.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String stringMain;
        stringMain = scanner.nextLine();

        System.out.println("Enter an anagram of a string: ");
        String stringCheck;
        stringCheck = scanner.nextLine();

        String message = "Your lines are not anagrams!";
        if (anagramLines(stringMain, stringCheck)) {
            message = "Congratulations! Your lines are anagrams!)";
        }

        System.out.println(message);
    }

    static Boolean anagramLines(String stringMain, String stringCheck) {
        char[] lineMain = clearString(stringMain.toUpperCase()).toCharArray();
        char[] lineCheck = clearString(stringCheck.toUpperCase()).toCharArray();

        Arrays.sort(lineMain);
        Arrays.sort(lineCheck);

        return Arrays.equals(lineMain, lineCheck);
    }

    static String clearString(String string) {
        return string.replaceAll("[^a-zA-Zа-яёА-ЯЁ\\d]", "");
    }
}
