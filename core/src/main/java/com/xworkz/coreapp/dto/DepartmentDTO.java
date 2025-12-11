package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepartmentDTO {
    private int id;
    private String deptName;
    private String managerName;
    private int employeeCount;
    private String location;
    private String email;
    private long phone;
}
