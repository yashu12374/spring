package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MovieDTO {
    private int id;
    private String movieName;
    private String genre;
    private String language;
    private int duration;
    private double rating;
    private String director;
}
