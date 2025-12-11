package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeliveryDTO {
    private int id;
    private String deliveryId;
    private String agentName;
    private String date;
    private String time;
    private String status;
    private String location;
}
