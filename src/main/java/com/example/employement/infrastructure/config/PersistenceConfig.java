package com.example.employement.infrastructure.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.employement.infrastructure.persistence.repository")
public class PersistenceConfig {
}
