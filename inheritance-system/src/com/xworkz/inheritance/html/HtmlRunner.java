package com.xworkz.inheritance.html;

public class HtmlRunner {
    public static void main(String[] args) {
        Html html = new Html();
        html.renderContent();
        html.addTags();

        FrontendFramework framework = new FrontendFramework();
        framework.renderContent();
        framework.addTags();
    }
}
