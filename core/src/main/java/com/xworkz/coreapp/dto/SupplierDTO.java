package com.xworkz.coreapp.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SupplierDTO {
    private int id;
    private String supplierName;
    private String company;
    private String email;
    private long phone;
    private String location;
    private String gstNo;
}
