package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FlightDTO {
    private int id;
    private String flightNo;
    private String airline;
    private String source;
    private String destination;
    private double price;
    private double duration;
}
