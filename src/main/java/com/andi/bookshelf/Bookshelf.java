package com.andi.bookshelf;

/*Legyen egy getLightestAuthor() függvénye, ami visszaadja annak a szerzőnek a nevét, aki a legkönnyebb könyvet írta.
Legyen egy getAuthorOfMostWrittenPages() függvénye, ami visszaadja annak a szerzőnek a nevét, aki a legtöbb oldalt írta.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bookshelf {
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks(int year) {
        return books.stream().filter(book -> book.getYear() == year).collect(Collectors.toList());
    }

    public String getLightestAuthor() {
        return books.stream().min(Comparator.comparingInt(Book::getWeight)).get().getAuthor();
    }

    public String getAuthorOfMostWrittenPages() {
        return books.stream().max(Comparator.comparingInt(Book::getPages)).get().getAuthor();
    }
}
