package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InsuranceDTO {
    private int id;
    private String policyNo;
    private String policyHolder;
    private String type;
    private double premium;
    private double amount;
    private String validity;
}
