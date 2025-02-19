package com.raju.shopping.registration.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateUserResponse {
    private String statusMessage;
    private int userId;
}
