package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class TransactionDTO {
    private int id;
    private String type;
    private double amount;
    private String date;
    private String status;
    private String fromAccount;
    private String toAccount;
}
