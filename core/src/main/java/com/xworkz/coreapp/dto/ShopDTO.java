package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ShopDTO{
private int id;
private String shopName;
private String ownerName;
private String type;
private String location;
private String gstNo;
private long phone;
}
