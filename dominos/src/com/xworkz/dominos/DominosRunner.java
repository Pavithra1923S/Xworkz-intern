package com.xworkz.dominos;
import com.xworkz.dominos.userdata.DominosUserDto;
import com.xworkz.dominos.signup.Dominos;
public class DominosRunner
{

        public static void main(String[] args) {
            DominosUserDto user1 = new DominosUserDto();
            user1.setEmail("pavithrasgowda1923@gail.com");
            user1.setPhoneNumber("9880478053");
            user1.setPassword("Biryani1");
            user1.setFullName("Pavithra");
            user1.setDeliveryAddress("R t nagar");

            Dominos dominos = new Dominos();
            if (dominos.userSignUp(user1)) {
                System.out.println("Dominos Registration Successful!");
            } else {
                System.out.println("Dominos Registration Failed!");
            }
        }
    }


