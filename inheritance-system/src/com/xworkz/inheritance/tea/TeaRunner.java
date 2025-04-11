package com.xworkz.inheritance.tea;

public class TeaRunner {
    public static void main(String args[]) {

        Tea tea = new Tea();
        tea.taste();
        tea.benefits();

        RedLabel redLabel = new RedLabel();
        redLabel.taste();
        redLabel.benefits();
    }
}
