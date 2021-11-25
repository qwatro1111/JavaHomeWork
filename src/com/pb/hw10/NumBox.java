package com.pb.hw10;

public class NumBox<T extends Number> {
    private final T[] numbers;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public void add(T num) {
        try {
            int index = findPlace();
            numbers[findPlace()] = num;
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public int findPlace() throws Exception {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                return i;
            }
        }

        throw new Exception("Array is fool!");
    }

    public T get(int index) {
        return numbers[index];
    }

    public int length() {
        int length = 0;
        for (T number: numbers) {
            if (number != null) {
                length++;
            }
        }

        return length;
    }

    public double sum() {
        double result = 0.0;
        for (T number: numbers) {
            if (number != null) {
                result += number.doubleValue();
            }
        }

        return result;
    }

    public double average() {
        return sum() / length();
    }

    public T max() {
        T result = get(0);
        for (T number: numbers) {
            if (result.doubleValue() < number.doubleValue()) {
                result = number;
            }
        }

        return result;
    }
}
