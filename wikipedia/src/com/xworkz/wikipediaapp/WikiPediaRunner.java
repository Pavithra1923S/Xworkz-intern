package com.xworkz.wikipediaapp;

import com.xworkz.wikipediaapp.wikipedia.WikiPediaDto;
import com.xworkz.wikipediaapp.login.WikipediaLogIn;

public class WikiPediaRunner {


        public static void main(String[] args) {

            WikiPediaDto wikiUser = new WikiPediaDto();
            wikiUser.setEmail("pavithra.com");
            wikiUser.setUserName("pavithrasgowda");
            wikiUser.setUserPassword("pavi@123");
            wikiUser.setRetypePassword("pavi@123");
            wikiUser.setPreferredLanguage("English");

            WikipediaLogIn login = new WikipediaLogIn();
            boolean loginResult = login.processLogin(wikiUser);


        }
    }


