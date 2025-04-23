package com.xworkz.method.bookapp;

public class BookRunner {

        public static void main(String[] args) {
            BookDto bookDto = new BookDto();
            bookDto.setBookId(101);
            bookDto.setTitle("Effective Java");
            bookDto.setAuthor("Joshua Bloch");
            bookDto.setPrice(45.99);
            bookDto.setPublisher("Addison-Wesley");

            System.out.println(bookDto.toString());
        }
    }



