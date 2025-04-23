package com.xworkz.method.library;

public class LibraryRunner {
   public static void main(String[] args) {
            LibraryDto libraryDto = new LibraryDto();
            libraryDto.setBookId(1);
            libraryDto.setBookTitle("The Great Gatsby");
            libraryDto.setAuthor("F. Scott Fitzgerald");
            libraryDto.setGenre("Fiction");
            libraryDto.setPublicationYear(1925);

            System.out.println(libraryDto.toString());
        }
    }



