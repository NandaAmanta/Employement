package com.example.employement.application.dto.response;

import com.example.employement.domain.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmployeeResponse {

    private Long id;

    private String email;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("phone_number")
    private String phoneNumber;
    public static EmployeeResponse from(User user) {
        EmployeeResponse userResponse = new EmployeeResponse();
        userResponse.setId(user.getId());
        userResponse.setEmail(user.getEmail());
        userResponse.setFirstName(user.getFirstName());
        userResponse.setLastName(user.getLastName());
        userResponse.setPhoneNumber(user.getPhoneNumber());
        return userResponse;
    }
}
