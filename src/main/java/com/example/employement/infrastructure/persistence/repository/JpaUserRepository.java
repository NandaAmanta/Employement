package com.example.employement.infrastructure.persistence.repository;

import com.example.employement.domain.model.User;
import com.example.employement.domain.repository.IUserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends IUserRepository, JpaRepository<User, Long> {

}