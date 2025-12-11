package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WalletDTO {
    private int id;
    private String walletId;
    private String userName;
    private double balance;
    private String type;
    private String createdDate;
    private String status;
}
