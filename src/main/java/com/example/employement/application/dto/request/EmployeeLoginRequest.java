package com.example.employement.application.dto.request;

import lombok.Data;

@Data
public class EmployeeLoginRequest {

    private String email;

    private String password;
}
