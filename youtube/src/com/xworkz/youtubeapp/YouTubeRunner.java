package com.xworkz.youtubeapp;
import com.xworkz.youtubeapp.youtube.YouTubeDto;
import com.xworkz.youtubeapp.loginuser.YouTubeLogIn;

public class YouTubeRunner {


        public static void main(String[] args) {

            YouTubeDto user = new YouTubeDto();
            user.setUserEmail("pavithrasgowda.com");
            user.setChannelName("all in one kannada");
            user.setPassword("Biryani");
            user.setConfirmPassword("Biryani");
            user.setMobile(990876543L);

            YouTubeLogIn login = new YouTubeLogIn();
            boolean result = login.startSignIn(user);

        }
    }


