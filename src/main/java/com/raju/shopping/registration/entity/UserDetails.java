package com.raju.shopping.registration.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "t_user_details", schema = "shopping")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @NotBlank(message = "First name is required")
//    @Size(max = 50, message = "First name cannot exceed 50 characters")
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

//    @NotBlank(message = "Last name is required")
//    @Size(max = 50, message = "Last name cannot exceed 50 characters")
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

//    @Size(max = 100, message = "City cannot exceed 100 characters")
    @Column(name = "city", length = 100)
    private String city;

//    @Size(max = 100, message = "State cannot exceed 100 characters")
    @Column(name = "state", length = 100)
    private String state;

//    @Size(max = 10, message = "Zip code must be at most 10 characters")
    @Column(name = "zip_code", length = 10)
    private String zipCode;

//    @Size(max = 10, message = "Phone number must be at most 10 characters")
    @Column(name = "phone_number", length = 10)
    private String phoneNumber;
}
