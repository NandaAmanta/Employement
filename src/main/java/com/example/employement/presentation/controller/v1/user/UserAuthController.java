package com.example.employement.presentation.controller.v1.user;

import com.example.employement.application.dto.request.UserLoginRequest;
import com.example.employement.application.dto.request.UserRegistrationRequest;
import com.example.employement.application.dto.response.ApiResponse;
import com.example.employement.application.service.AuthService;
import com.example.employement.common.constant.RouteModuleV1Constant;
import jakarta.validation.Valid;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(RouteModuleV1Constant.USER_AUTH)
public class UserAuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> register(@Valid @RequestBody UserRegistrationRequest request) throws BadRequestException {
        return ResponseEntity.ok(ApiResponse.success("Registration successful",authService.register(request)));
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse> login(UserLoginRequest request) {
        return ResponseEntity.ok(ApiResponse.success("Login successful",authService.login(request)));
    }

}
