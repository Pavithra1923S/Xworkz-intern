package com.xworkz.githubapp;
import com.xworkz.githubapp.userdata.GitHubUserDto;
import com.xworkz.githubapp.signup.GitHub;
public class GitHubRunner
{

        public static void main(String[] args) {
            GitHubUserDto user1 = new GitHubUserDto();
            user1.setEmail("pavithra@gmail.com");
            user1.setUserName("Pavithra");
            user1.setPassword("Biryani01");
            user1.setFullName("pavithra");
            user1.setBio("Java backend developer");

            GitHub github = new GitHub();
            if (github.userSignUp(user1)) {
                System.out.println("GitHub Registration Successful!");
            } else {
                System.out.println("GitHub Registration Failed!");
            }
        }
    }

