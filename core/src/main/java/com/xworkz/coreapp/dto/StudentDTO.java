package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDTO {
    private int studentId;
    private String studentName;
    private int age;
    private String course;
    private String branch;
    private String email;
    private long phoneNo;
}

