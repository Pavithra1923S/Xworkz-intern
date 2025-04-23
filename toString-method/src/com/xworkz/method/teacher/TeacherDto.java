package com.xworkz.method.teacher;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeacherDto {

    private int teacherId;
    private String teacherName;
    private String subject;
    private int experience;
    private String qualification;

    @Override
    public String toString() {
        return "TeacherDto: \nteacherId = " + this.teacherId +
                " ," + "\nteacherName = " + this.teacherName +
                " ," + "\nsubject = " + this.subject +
                " ," + "\nexperience = " + this.experience +
                " ," + "\nqualification = " + this.qualification;
    }
}
