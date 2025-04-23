package com.xworkz.method.College;

public class CollegeRunner {
    public static void main(String[] args) {
        CollegeDto collegeDto = new CollegeDto();
        collegeDto.setCollegeId(301);
        collegeDto.setCollegeName("Vivekananda Institute Of technology");
        collegeDto.setCity("Bangalore");
        collegeDto.setTotalStudents(5000);
        collegeDto.setUniversity("VTU");

        System.out.println(collegeDto.toString());
    }


}
