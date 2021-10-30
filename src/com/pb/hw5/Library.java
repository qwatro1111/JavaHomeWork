package com.pb.hw5;

import java.util.Date;

public class Library {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Приключения", "Иванов И. И.", 2000),
                new Book("Словарь", "Сидоров А. В.", 1980),
                new Book("Энциклопедия", "Гусев К. В.", 2010)
        };

        Reader[] readers = {
                new Reader("Петров В. В.", 10109940, "history", "10/10/1990", "+380807006050"),
                new Reader("Серов В. А.", 20109942, "painting", "10/10/1991", "+380807006051"),
                new Reader("Брюллов К. П.", 30109943, "drawing", "10/10/1992", "+380807006052")
        };

        System.out.println("Книги в библиотеке: ");
        for (Book book:books) {
            System.out.println(book.print());
        }

        System.out.println("Читатели в библтотеке: ");
        for (Reader reader: readers) {
            System.out.println(reader.print());
        }

        String[] nameBooks = new String[books.length];
        for (int i = 0; i < books.length; i++) {
            nameBooks[i] = books[i].getName();
        }

        System.out.println("Действия в библиотеке: ");
        for (Reader reader: readers) {
            // counter books
            System.out.println(reader.takeBook(books.length));
            System.out.println(reader.returnBook(books.length));
            // name books
            System.out.println(reader.takeBook(nameBooks));
            System.out.println(reader.returnBook(nameBooks));
            // object books
            System.out.println(reader.takeBook(books));
            System.out.println(reader.returnBook(books));
        }
    }
}
