package com.andi.bookshelf;

public class HardcoverBook extends Book {
    public HardcoverBook(String title, String author, int year, int pages) {
        super(title, author, year, pages, 100 + 10 * pages);
    }
}
