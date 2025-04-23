package com.xworkz.method.school;

public class SchoolRunner {
    public static void main(String[] args) {
        SchoolDto schoolDto = new SchoolDto();
        schoolDto.setSchoolId(1);
        schoolDto.setSchoolName("Jindal Public School");
        schoolDto.setBoard("State");
        schoolDto.setTotalClasses(12);
        schoolDto.setPrincipalName("Mr. Gunashekaran");

        System.out.println(schoolDto.toString());
    }
}
