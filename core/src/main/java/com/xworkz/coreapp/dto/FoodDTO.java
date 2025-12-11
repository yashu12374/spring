package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FoodDTO {
    private int id;
    private String foodName;
    private String type;
    private double price;
    private int quantity;
    private String restaurant;
    private String description;
}
