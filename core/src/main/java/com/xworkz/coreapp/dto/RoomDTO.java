package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoomDTO {
    private int roomId;
    private int roomNumber;
    private String type;
    private double price;
    private int capacity;
    private String status;
    private int floor;
}

