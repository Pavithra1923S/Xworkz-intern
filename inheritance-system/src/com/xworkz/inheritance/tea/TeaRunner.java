package com.xworkz.inheritance.tea;

public class TeaRunner {
    public static void main(String args[]) {

        Tea tea = new Tea();
        tea.taste();
        tea.benefits();

        RedLabel redLabel = new RedLabel();
        redLabel.taste();
        redLabel.benefits();

        Tea tea1 = new RedLabel();
        System.out.println(tea1);

        RedLabel redLabel1 =(RedLabel)tea1;
        System.out.println(redLabel1);
    }
}
