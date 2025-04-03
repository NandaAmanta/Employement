package com.example.employement.application.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class UserLoginRequest {

    @NotBlank
    @JsonProperty("email")
    private String email;

    @NotBlank
    @JsonProperty("password")
    private String password;

    @JsonProperty("remember_me")
    private boolean rememberMe = false;
}