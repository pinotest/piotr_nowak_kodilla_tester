package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author){
        Book book = new Book(title,author);

        if (books.contains(book)) {
            System.out.println("Book already exist!!!");
            System.out.println(book.getAuthor()+" "+book.getTitle()+":"+ book.hashCode());
                }
        ;
        books.add(book);
        return book;
    }
}
