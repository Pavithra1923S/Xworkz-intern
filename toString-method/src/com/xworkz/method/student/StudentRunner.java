package com.xworkz.method.student;

public class StudentRunner {
    public static void main(String[] args) {
            StudentDto studentDto = new StudentDto();
            studentDto.setStudentId(1);
            studentDto.setStudentName("John Doe");
            studentDto.setCourse("Computer Science");
            studentDto.setAge(21);
            studentDto.setUniversity("Harvard");

            System.out.println(studentDto.toString());
        }
    }


