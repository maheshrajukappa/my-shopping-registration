package com.raju.shopping.registration.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateUserRequest {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
}
