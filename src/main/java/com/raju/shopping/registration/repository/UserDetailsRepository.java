package com.raju.shopping.registration.repository;

import com.raju.shopping.registration.entity.UserDetails;
import com.raju.shopping.registration.entity.UserId;
import org.springframework.data.repository.CrudRepository;

public interface UserDetailsRepository extends CrudRepository<UserDetails, Integer> {

}