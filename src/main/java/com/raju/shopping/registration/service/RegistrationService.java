package com.raju.shopping.registration.service;

import com.raju.shopping.registration.entity.UserDetails;
import com.raju.shopping.registration.entity.UserId;
import com.raju.shopping.registration.model.CheckUserIdRequest;
import com.raju.shopping.registration.model.CheckUserIdResponse;
import com.raju.shopping.registration.model.CreateUserRequest;
import com.raju.shopping.registration.model.CreateUserResponse;
import com.raju.shopping.registration.repository.UserDetailsRepository;
import com.raju.shopping.registration.repository.UserIdRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@Slf4j
public class RegistrationService {

    @Autowired
    UserIdRepository userIdRepository;

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public CheckUserIdResponse isUserRegistered(CheckUserIdRequest request) {
        CheckUserIdResponse userIdResponse = new CheckUserIdResponse();
        UserId userId = userIdRepository.findByUserId(request.getUserId());
        if (userId != null) {
            log.info("user-id is taken");
            userIdResponse.setIsRegistered("Already Registered");
        } else {
            log.info("user-id is available");
            userIdResponse.setIsRegistered("user-id is available");
        }

        return userIdResponse;
    }

    public CreateUserResponse createUser(CreateUserRequest createUserRequest){
        UserDetails details = new UserDetails();
        details.setFirstName(createUserRequest.getFirstName());
        details.setLastName(createUserRequest.getLastName());
        details.setCity(createUserRequest.getCity());
        details.setState(createUserRequest.getState());
        details.setZipCode(createUserRequest.getZipCode());
        details.setPhoneNumber(createUserRequest.getPhoneNumber());

        UserDetails saved = userDetailsRepository.save(details);
        CreateUserResponse response= new CreateUserResponse();
        if (saved!= null){
            log.info("User Details saved successfully");
            response.setStatus("Success");
        }
        else{
            log.error("Error in saving details");
            response.setStatus("Error");
        }
        return response;
    }

}
