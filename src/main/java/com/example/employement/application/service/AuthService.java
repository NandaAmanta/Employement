package com.example.employement.application.service;

import com.example.employement.application.dto.request.EmployeeLoginRequest;
import com.example.employement.application.dto.request.EmployeeRegistrationRequest;
import com.example.employement.application.dto.request.UserLoginRequest;
import com.example.employement.application.dto.request.UserRegistrationRequest;
import com.example.employement.application.dto.response.EmployeeResponse;
import com.example.employement.application.dto.response.UserResponse;
import com.example.employement.domain.model.User;
import com.example.employement.domain.repository.IUserRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private IUserRepository userRepository;

    public UserResponse login(UserLoginRequest request) {
        return null;
    }

    public EmployeeResponse login(EmployeeLoginRequest request , Long companyId) {
        return null;
    }

    /**
     * Register a new user account.
     *
     * @param request the registration request
     * @return the response containing the registered user
     */
    public UserResponse register(UserRegistrationRequest request) throws BadRequestException {
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new BadRequestException("Email already exists");
        }
        User savedUser = userRepository.save(request.toEntity());
        return UserResponse.from(savedUser);
    }

    public EmployeeResponse register(EmployeeRegistrationRequest request) {
        return null;
    }

}
