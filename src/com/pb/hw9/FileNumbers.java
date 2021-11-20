package com.pb.hw9;

import java.io.*;
import java.util.*;

public class FileNumbers {

    private static final int RANDOM_NUMBER_MIN = 1;
    private static final int RANDOM_NUMBER_MAX = 99;

    private static final int COUNT_NUMBERS_IN_STRING = 10;
    private static final int COUNT_STRINGS = 10;

    public static void main(String[] args) {
        createNumbersFile();
        createOddNumbersFile();
    }

    public static void createNumbersFile() {
        String result = "";
        for (int i = 0; i < COUNT_STRINGS; i++) {
            for (int j = 0; j < COUNT_NUMBERS_IN_STRING; j++) {
                result += getRandomNumber();
                if (j < (COUNT_NUMBERS_IN_STRING - 1)) {
                    result += " ";
                }
            }
            if (i < (COUNT_STRINGS - 1)) {
                result += "\n";
            }
        }

        writeInFile(result, "src/com/pb/hw9/numbers.txt");

        System.out.println("Create numbers: ");
        System.out.println(result);
    }

    public static void createOddNumbersFile() {
        String result = "";

        try (Reader reader = new FileReader("src/com/pb/hw9/numbers.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                result += resetEventNumbersInString(scanner.nextLine());
                if (scanner.hasNext()) {
                    result += "\n";
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        writeInFile(result, "src/com/pb/hw9/odd-numbers.txt");

        System.out.println("Create odd numbers: ");
        System.out.println(result);
    }

    private static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(RANDOM_NUMBER_MAX - RANDOM_NUMBER_MIN) + RANDOM_NUMBER_MIN;

        return randomNumber;
    }

    private static String resetEventNumbersInString(String lineWithNumbers) {
        String result = "";
        String[] lineNumbers = lineWithNumbers.split(" ");
        int i = lineNumbers.length;
        for (String lineNumber: lineNumbers) {
            i--;
            result += resetEventNumberInString(lineNumber);
            if (i > 0) {
                result += " ";
            }
        }

        return result;
    }

    private static int resetEventNumberInString(String number) {
        try {
            if (Integer.parseInt(number) % 2 != 0) {
                return Integer.parseInt(number);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }

    private static void writeInFile(String result, String path) {
        try (Writer writer = new FileWriter(path)) {
            writer.write(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
