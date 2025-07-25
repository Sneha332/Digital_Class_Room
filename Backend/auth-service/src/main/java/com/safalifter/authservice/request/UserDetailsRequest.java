package com.safalifter.authservice.request;

import lombok.Getter;

@Getter
public class UserDetailsRequest {
    private String firstName;
    private String lastName;
    private String phoneNumber;    
    private String country;
    private String city;
    private String address;
    private String postalCode;
    private String aboutMe;
    private String profilePicture;
}