package com.education.chalk;

import com.education.chalk.chalk.Chalk;

public class ChalkRunner {
    public static void main(String[] args) {
        Chalk chalk1 = new Chalk();
        chalk1.setColor("White");
        chalk1.setType("Dustless");
        chalk1.setBrand("Camlin");
        chalk1.setDustFree(true);
        chalk1.setEcoFriendly(true);
        chalk1.setLength(7.0);
        chalk1.setPrice(25.0);

        Chalk chalk2 = new Chalk();
        chalk2.setColor("Yellow");
        chalk2.setType("Colored");
        chalk2.setBrand("Apsara");
        chalk2.setDustFree(false);
        chalk2.setEcoFriendly(true);
        chalk2.setLength(6.5);
        chalk2.setPrice(30.0);

        Chalk chalk3 = new Chalk();
        chalk3.setColor("Green");
        chalk3.setType("Standard");
        chalk3.setBrand("Natraj");
        chalk3.setDustFree(false);
        chalk3.setEcoFriendly(false);
        chalk3.setLength(6.0);
        chalk3.setPrice(20.0);

        Chalk chalk4 = new Chalk();
        chalk4.setColor("Blue");
        chalk4.setType("Colored");
        chalk4.setBrand("Classmate");
        chalk4.setDustFree(true);
        chalk4.setEcoFriendly(true);
        chalk4.setLength(7.5);
        chalk4.setPrice(35.0);

        Chalk chalk5 = new Chalk();
        chalk5.setColor("Pink");
        chalk5.setType("Dustless");
        chalk5.setBrand("Faber-Castell");
        chalk5.setDustFree(true);
        chalk5.setEcoFriendly(false);
        chalk5.setLength(7.2);
        chalk5.setPrice(28.0);

        chalk1.details();
        chalk2.details();
        chalk3.details();
        chalk4.details();
        chalk5.details();
    }
}