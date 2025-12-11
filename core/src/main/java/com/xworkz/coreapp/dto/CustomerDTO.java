package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDTO {

    private int customerId;
    private String customerName;
    private int age;
    private String gender;
    private String email;
    private long phoneNo;
    private String address;
}
