package com.example.employement.infrastructure.persistence;

import com.example.employement.domain.model.Company;
import com.example.employement.domain.repository.ICompanyRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCompanyRepository extends ICompanyRepository, JpaRepository<Company, Long> {
}
