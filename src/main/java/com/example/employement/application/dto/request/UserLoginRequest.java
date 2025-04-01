package com.example.employement.application.dto.request;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class UserLoginRequest {
    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("remember_me")
    private boolean rememberMe;
}