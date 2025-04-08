package com.utility.ladder;

import com.utility.ladder.ladder.Ladder;

public class LadderRunner {
    public static void main(String[] args) {
        Ladder ladder1 = new Ladder();
        ladder1.setMaterial("Aluminum");
        ladder1.setSteps(5);
        ladder1.setHeightInFeet(6.5);
        ladder1.setColor("Silver");
        ladder1.setFoldable(true);
        ladder1.setWeight(4.2);
        ladder1.setPrice(1500);

        Ladder ladder2 = new Ladder();
        ladder2.setMaterial("Steel");
        ladder2.setSteps(7);
        ladder2.setHeightInFeet(8.0);
        ladder2.setColor("Grey");
        ladder2.setFoldable(true);
        ladder2.setWeight(5.6);
        ladder2.setPrice(1800);

        Ladder ladder3 = new Ladder();
        ladder3.setMaterial("Wood");
        ladder3.setSteps(4);
        ladder3.setHeightInFeet(5.5);
        ladder3.setColor("Brown");
        ladder3.setFoldable(false);
        ladder3.setWeight(6.0);
        ladder3.setPrice(2000);

        Ladder ladder4 = new Ladder();
        ladder4.setMaterial("Plastic");
        ladder4.setSteps(3);
        ladder4.setHeightInFeet(4.0);
        ladder4.setColor("Blue");
        ladder4.setFoldable(true);
        ladder4.setWeight(3.0);
        ladder4.setPrice(950);

        Ladder ladder5 = new Ladder();
        ladder5.setMaterial("Fiberglass");
        ladder5.setSteps(6);
        ladder5.setHeightInFeet(7.5);
        ladder5.setColor("Yellow");
        ladder5.setFoldable(true);
        ladder5.setWeight(4.8);
        ladder5.setPrice(2200);

        ladder1.details();
        ladder2.details();
        ladder3.details();
        ladder4.details();
        ladder5.details();
    }
}