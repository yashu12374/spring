package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseDTO {
    private int id;
    private String courseName;
    private String duration;
    private double fees;
    private String instructor;
    private String category;
    private String description;
}
