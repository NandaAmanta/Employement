package com.example.employement.presentation.controller;

import com.example.employement.application.dto.request.EmployeeLoginRequest;
import com.example.employement.application.dto.request.UserLoginRequest;
import com.example.employement.application.dto.response.ApiResponse;
import com.example.employement.application.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class EmployeeAuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ApiResponse login(EmployeeLoginRequest request) {
        return ApiResponse.success("Login successful",authService.login(request));
    }
}
