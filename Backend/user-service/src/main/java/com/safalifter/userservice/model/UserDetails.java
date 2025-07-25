package com.safalifter.userservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.safalifter.userservice.request.UserDetailsRequest;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDetails {
    private String firstName;
    private String lastName;
    private String phoneNumber;    
    private String country;
    private String city;
    private String address;
    private String postalCode;
    private String aboutMe;
    private String profilePicture;
    
    
    
    public UserDetails(UserDetailsRequest request) {
        this.firstName = request.getFirstName();
        this.lastName = request.getLastName();
        this.phoneNumber = request.getPhoneNumber();
        this.country = request.getCountry();
        this.city = request.getCity();
        this.address = request.getAddress();
        this.postalCode = request.getPostalCode();
        this.aboutMe = request.getAboutMe();
        this.profilePicture = request.getProfilePicture();
    }
    
}
