package com.raju.shopping.registration.repository;

import com.raju.shopping.registration.entity.UserId;
import org.springframework.data.repository.CrudRepository;

public interface UserIdRepository extends CrudRepository<UserId, String> {
    UserId findByUserId(String userId);
}