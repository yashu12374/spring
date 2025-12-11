package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CardDTO {
    private int id;
    private String cardNumber;
    private String holderName;
    private String type;
    private String expiryDate;
    private String bankName;
    private double limit;
}
