package com.xworkz.method.student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {
        private int studentId;
        private String studentName;
        private String course;
        private int age;
        private String university;

        @Override
        public String toString() {
            return "StudentDto: \nstudentId = " + this.studentId +
                    " ," + "\nstudentName = " + this.studentName +
                    " ," + "\ncourse = " + this.course +
                    " ," + "\nage = " + this.age +
                    " ," + "\nuniversity = " + this.university;
        }
    }



