package com.xworkz.method.teacher;

public class TeacherRunner {
    public static void main(String[] args) {
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setTeacherId(301);
        teacherDto.setTeacherName("Dev");
        teacherDto.setSubject("Java");
        teacherDto.setExperience(10);
        teacherDto.setQualification("B.E");

        System.out.println(teacherDto.toString());
    }
}
