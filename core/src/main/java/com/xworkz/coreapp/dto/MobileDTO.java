package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MobileDTO {
    private int id;
    private String brand;
    private String model;
    private int ram;
    private int storage;
    private double price;
    private int battery;
}
