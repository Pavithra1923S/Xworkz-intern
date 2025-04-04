package com.xworkx.gym.gym;

import com.xworkx.gym.trainer.Trainer;
import com.xworkx.gym.member.Member;
public class Gym {



        public String name;
        public String location;
        public Trainer trainers[];
        public Member members[];

        public void displayGymInfo() {
            System.out.println("Gym Name: " + name);
            System.out.println("Location: " + location);
            System.out.println("-- Trainers --");
            for (Trainer trainer : trainers) {
                trainer.displayTrainerInfo();
            }

            System.out.println("-- Members --");
            for (Member member : members) {
                member.displayMemberInfo();
            }
        }
    }




