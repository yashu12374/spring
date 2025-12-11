package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDTO {
    private int empId;
    private String empName;
    private String department;
    private String designation;
    private double salary;
    private String email;
    private long phone;
}
