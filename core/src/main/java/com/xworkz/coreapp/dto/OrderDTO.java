package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDTO {
    private int orderId;
    private String orderDate;
    private String customerName;
    private String paymentMode;
    private double totalAmount;
    private String status;
    private String deliveryAddress;
}

