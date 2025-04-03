package com.example.employement.application.dto.request;

import com.example.employement.domain.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class UserRegistrationRequest {

    @NotBlank
    @Length(min = 3, max = 100)
    private String email;

    @NotBlank
    @Length(min = 8, max = 100)
    private String password;

    @NotBlank
    @Length(min = 1, max = 250)
    @JsonProperty("first_name")
    private String firstName;

    @NotBlank
    @Length(min = 1, max = 250)
    @JsonProperty("last_name")
    private String lastName;

    @NotBlank
    @Length(min = 1, max = 20)
    @JsonProperty("phone_number")
    private String phoneNumber;

    public User toEntity(){
        PasswordEncoder passwordEncoder =
                PasswordEncoderFactories.createDelegatingPasswordEncoder();
        User user = new User();
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhoneNumber(phoneNumber);
        return user;
    }
}
