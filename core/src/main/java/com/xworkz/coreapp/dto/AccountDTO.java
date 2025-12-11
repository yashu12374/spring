package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
@ToString
public class AccountDTO {
    private int id;
    private String accountHolderName;
    private String accountNumber;
    private String type;
    private double balance;
    private String branch;
    private String ifsc;
}
