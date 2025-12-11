package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LaptopDTO {
    private int id;
    private String brand;
    private String model;
    private String processor;
    private int ram;
    private double price;
    private int storage;
}
