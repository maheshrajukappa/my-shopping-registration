package com.raju.shopping.registration.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "t_user_id")
public class UserId {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;
    @Column
    private boolean isLocked;

}