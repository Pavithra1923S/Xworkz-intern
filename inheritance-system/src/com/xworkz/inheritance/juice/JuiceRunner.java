package com.xworkz.inheritance.juice;

import com.xworkz.inheritance.tea.RedLabel;
import com.xworkz.inheritance.tea.Tea;

public class JuiceRunner {
    public static void main(String args[]) {

        Juice juice = new Juice();
        juice.taste();
        juice.cool();

        Maaza maaza = new Maaza();
        maaza.taste();
        maaza.cool();
    }
}
