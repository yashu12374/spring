package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VehicleDTO {
    private int vehicleId;
    private String vehicleName;
    private String model;
    private String brand;
    private int year;
    private double price;
    private String fuelType;
}

