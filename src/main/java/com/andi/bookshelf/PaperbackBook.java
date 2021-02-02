package com.andi.bookshelf;

public class PaperbackBook extends Book {
    public PaperbackBook(String title, String author, int year, int pages) {
        super(title, author, year, pages, 20 + 10 * pages);
    }
}

