package com.xworkz.inheritance.bookstore;

public class BookStoreRunner {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        store.addNewBook();
        store.displayBooks();

        OnlineBookStore online = new OnlineBookStore();
        online.addNewBook();
        online.displayBooks();

        BookStore bookStore =new OnlineBookStore();
        System.out.println(bookStore);

        OnlineBookStore onlineBookStore =(OnlineBookStore) bookStore;
        System.out.println(onlineBookStore);
    }
}
