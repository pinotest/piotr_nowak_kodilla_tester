package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book newBook = BookManager.createBook("Zombi", "Stephen King");
        Book newBook1 = BookManager.createBook("Birds", "Alan Smoke");
        Book newBook2 = BookManager.createBook("Zombi", "Stephen King");
        Book newBook3 = BookManager.createBook("Birds", "Alan Smoke");
        System.out.println("---------------------");
        System.out.println(newBook.getTitle()+" "+newBook.hashCode());
        System.out.println(newBook1.getTitle()+" "+newBook1.hashCode());
        System.out.println(newBook2.getTitle()+" "+newBook2.hashCode());
        System.out.println(newBook3.getTitle()+" "+newBook3.hashCode());
        System.out.println("---------------------");
        for (Book oneBook: BookManager.books
             ) {
            System.out.println(oneBook.getTitle()+" - hashCode: "+oneBook.hashCode());

        }


    }
}
