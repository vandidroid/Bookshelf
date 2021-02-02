package com.andi.bookshelf;

public class Book {
    private String title;
    private String author;
    private int year;
    private int weight;
    private int pages;

    public Book(String title, String author, int year, int pages, int weight) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.weight = weight;
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public int getWeight() {
        return weight;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getInfo() {
        return author + ": " + title + " (" + year + ")";
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", pages=" + pages
               ;
    }
}
