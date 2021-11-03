package com.kodilla.collections.adv.immutable;

public final class Book {
    protected final String bookName;
    protected final String bookAuthor;

    public Book(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public final String getBookName() {
        return bookName;
    }

    public final String getBookAuthor() {
        return bookAuthor;
    }
}
