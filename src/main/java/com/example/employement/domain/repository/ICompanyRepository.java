package com.example.employement.domain.repository;

import com.example.employement.domain.model.Company;
import java.util.Optional;

public interface ICompanyRepository {
    Optional<Company> findById(Long id);

    Company save(Company company);
}
