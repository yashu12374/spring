package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TrainerDTO {
    private int trainerId;
    private String trainerName;
    private String subject;
    private int experience;
    private String qualification;
    private String email;
    private long phoneNo;
    private String location;
}
