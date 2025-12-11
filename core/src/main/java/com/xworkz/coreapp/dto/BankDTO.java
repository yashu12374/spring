package com.xworkz.coreapp.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BankDTO {
private int id;
private String bankName;
private String branch;
private String ifsc;
private long contact;
private String email;
private String location;
}
