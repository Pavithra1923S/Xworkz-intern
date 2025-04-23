package com.xworkz.method.bookapp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDto {

        private int bookId;
        private String title;
        private String author;
        private double price;
        private String publisher;

        @Override
        public String toString() {
            return "BookDto: \nbookId = " + this.bookId +
                    " ," + "\ntitle = " + this.title +
                    " ," + "\nauthor = " + this.author +
                    " ," + "\nprice = " + this.price +
                    " ," + "\npublisher = " + this.publisher;
        }
    }



