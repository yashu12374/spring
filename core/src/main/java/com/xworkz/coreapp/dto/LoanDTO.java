package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class LoanDTO {
    private int id;
    private String loanId;
    private String borrowerName;
    private double amount;
    private double interestRate;
    private int duration;
    private String type;
    private String status;
}
