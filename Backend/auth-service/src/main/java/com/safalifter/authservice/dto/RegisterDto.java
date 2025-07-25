package com.safalifter.authservice.dto;

import com.safalifter.authservice.request.UserDetailsRequest;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterDto {
    private String id;
    private String username;
    private String email;
    
    private UserDetailsRequest userDetailsRequest;
}
