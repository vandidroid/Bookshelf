package com.andi.bookshelf;

public class Main {

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();

        Book book = new Book("Erzsi for President", "G.Homonnay",2018, 100, 1200);
        PaperbackBook paperbackBook = new PaperbackBook("Crime and Punishment", "Фёдор Михайлович Достоевский", 1850,600);
        HardcoverBook hardcoverBook = new HardcoverBook("1984", "Orwel",1948,250);


        bookshelf.addBook(book);
        bookshelf.addBook(paperbackBook);
        bookshelf.addBook(hardcoverBook);

        System.out.println(bookshelf.getLightestAuthor());
        System.out.println(bookshelf.getBooks(1948));
        System.out.println(bookshelf.getAuthorOfMostWrittenPages());
    }
}
