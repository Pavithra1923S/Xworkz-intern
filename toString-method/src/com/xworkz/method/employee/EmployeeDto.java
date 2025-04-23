package com.xworkz.method.employee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class EmployeeDto {
    private int employeeId;
        private String employeeName;
        private String department;
        private double salary;
        private String location;

        @Override
        public String toString() {
            return "EmployeeDto: \nemployeeId = " + this.employeeId +
                    " ," + "\nemployeeName = " + this.employeeName +
                    " ," + "\ndepartment = " + this.department +
                    " ," + "\nsalary = " + this.salary +
                    " ," + "\nlocation = " + this.location;
        }
    }


