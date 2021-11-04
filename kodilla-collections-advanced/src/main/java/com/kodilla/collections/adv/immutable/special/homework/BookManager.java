package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author){
        Book book = new Book(title,author);
        for (Book oneBook: books
        ) {


            if ((book.getTitle() == oneBook.getTitle()) && (book.getAuthor()== oneBook.getAuthor())){
                System.out.println("######");
                System.out.println("Book already exist!!!");
                System.out.println("New book: ");
                System.out.println(book.getAuthor()+" "+book.getTitle()+":"+ book.hashCode());
                System.out.println("Existing book: ");
                System.out.println(oneBook.getAuthor()+" "+oneBook.getTitle()+":"+ oneBook.hashCode());
            }
        }
        books.add(book);
        return book;
    }
}
