package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HotelDTO {
    private int hotelId;
    private String hotelName;
    private String location;
    private double rating;
    private int rooms;
    private String contact;
    private String email;
}

