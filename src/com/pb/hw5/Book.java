package com.pb.hw5;

public class Book {
    private String name;
    private String author;
    private int yearOfPublishing;

    public Book(String name, String author, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String print() {
        return name + " (" + author + " " + yearOfPublishing + " г.)";
    }

    public String getName() {
        return name;
    }
}
