package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressDTO {
    private int id;
    private String houseNo;
    private String street;
    private String city;
    private String state;
    private int pincode;
    private String country;
}
