package com.example.employement.presentation.controller.v1.employee;

import com.example.employement.application.dto.request.EmployeeLoginRequest;
import com.example.employement.application.dto.response.ApiResponse;
import com.example.employement.application.service.AuthService;
import com.example.employement.common.constant.RouteModuleV1Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(RouteModuleV1Constant.EMPLOYEE_AUTH)
public class EmployeeAuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/{companyId}/login")
    public ResponseEntity<ApiResponse> login(EmployeeLoginRequest request, @PathVariable Long companyId) {
        return ResponseEntity.ok(ApiResponse.success("Login successful",authService.login(request, companyId)));
    }
}
