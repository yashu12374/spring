package com.xworkz.coreapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {

    private int userId;
    private String userName;
    private int age;
    private String gender;
    private String email;
    private String password;
    private long phoneNo;
    private String address;
}
