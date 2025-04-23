package com.xworkz.method.school;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SchoolDto {
    private int schoolId;
    private String schoolName;
    private String board;
    private int totalClasses;
    private String principalName;

    @Override
    public String toString() {
        return "SchoolDto: \nschoolId = " + this.schoolId +
                " ," + "\nschoolName = " + this.schoolName +
                " ," + "\nboard = " + this.board +
                " ," + "\ntotalClasses = " + this.totalClasses +
                " ," + "\nprincipalName = " + this.principalName;
    }

}
