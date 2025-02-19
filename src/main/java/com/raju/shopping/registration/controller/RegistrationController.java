package com.raju.shopping.registration.controller;

import com.raju.shopping.registration.model.CheckUserIdRequest;
import com.raju.shopping.registration.model.CheckUserIdResponse;
import com.raju.shopping.registration.model.CreateUserRequest;
import com.raju.shopping.registration.model.CreateUserResponse;
import com.raju.shopping.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/microservices/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/user-id-check")
    public CheckUserIdResponse isUserRegistered(@RequestBody CheckUserIdRequest request) {
        CheckUserIdResponse userRegistered = registrationService.isUserRegistered(request);
        System.out.println("request processing completed. response: " + userRegistered);
        return userRegistered;
    }
    @PutMapping("/create-user-details")
    public CreateUserResponse registerUser(@RequestBody CreateUserRequest request) {
        return registrationService.createUser(request);
    }
}
