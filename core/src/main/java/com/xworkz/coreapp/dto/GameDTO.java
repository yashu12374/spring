package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GameDTO {
    private int id;
    private String gameName;
    private String genre;
    private String platform;
    private double price;
    private double rating;
    private String developer;
}
