package com.example.employement.domain.repository;

import com.example.employement.domain.model.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICompanyRepository {
    Optional<Company> findById(Long id);

    Company save(Company company);

    boolean deleteById(Long id);

    Page<Company> pagination(Pageable pageable);
}
