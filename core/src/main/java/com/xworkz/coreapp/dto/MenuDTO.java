package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MenuDTO {
    private int id;
    private String itemName;
    private String category;
    private double price;
    private String description;
    private String available;
    private String restaurant;
}
