package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BillDTO {
    private int id;
    private String billNo;
    private String date;
    private double amount;
    private String customerName;
    private String paymentMode;
    private String status;
}
