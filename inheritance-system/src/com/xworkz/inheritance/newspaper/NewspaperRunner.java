package com.xworkz.inheritance.newspaper;

public class NewspaperRunner {
    public static void main(String[] args) {
        Newspaper paper = new Newspaper();
        paper.collectNews();
        paper.editArticles();

        Economics economics = new Economics();
        economics.collectNews();
        economics.editArticles();
    }
}
