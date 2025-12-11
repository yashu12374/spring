package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TrainDTO {
    private int id;
    private String trainNo;
    private String name;
    private String source;
    private String destination;
    private String time;
    private String type;
}
