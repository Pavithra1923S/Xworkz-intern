package com.xworkz.method.employee;

public class EmployeeRunner {
   public static void main(String[] args) {
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setEmployeeId(1001);
            employeeDto.setEmployeeName("Alice Johnson");
            employeeDto.setDepartment("Engineering");
            employeeDto.setSalary(75000.50);
            employeeDto.setLocation("New York");

            System.out.println(employeeDto.toString());
        }
    }


