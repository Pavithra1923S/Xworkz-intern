package com.xworkz.method.College;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CollegeDto {
    private int collegeId;
    private String collegeName;
    private String city;
    private int totalStudents;
    private String university;

    @Override
    public String toString() {
        return "CollegeDto: \ncollegeId = " + this.collegeId +
                " ," + "\ncollegeName = " + this.collegeName +
                " ," + "\ncity = " + this.city +
                " ," + "\ntotalStudents = " + this.totalStudents +
                " ," + "\nuniversity = " + this.university;
    }
    }
