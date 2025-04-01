package com.example.employement.domain.repository;

import com.example.employement.domain.model.User;

import java.util.Optional;

public interface IUserRepository {

    Optional<User> findByEmail(String email);

    Optional<User> findById(Long id);

    User save(User user);
}
