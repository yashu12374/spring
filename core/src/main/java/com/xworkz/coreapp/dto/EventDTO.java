package com.xworkz.coreapp.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EventDTO {
    private int id;
    private String eventName;
    private String date;
    private String time;
    private String organizer;
    private String venue;
    private double ticketPrice;
}
