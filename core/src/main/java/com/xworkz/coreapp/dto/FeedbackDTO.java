package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FeedbackDTO {
    private int id;
    private String userName;
    private String comments;
    private double rating;
    private String date;
    private String email;
    private String serviceName;
}
