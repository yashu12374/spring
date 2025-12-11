package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TeacherDTO {
    private int teacherId;
    private String teacherName;
    private String subject;
    private String qualification;
    private int experience;
    private String email;
    private double salary;
}

