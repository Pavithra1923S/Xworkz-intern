package com.xworkz.inheritance.library;

public class LibraryRunner {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.openLibrary();
        lib.lendBook();

        PublicLibrary publicLib = new PublicLibrary();
        publicLib.openLibrary();
        publicLib.lendBook();
    }
}
