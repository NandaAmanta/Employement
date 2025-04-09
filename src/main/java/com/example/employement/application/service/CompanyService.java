package com.example.employement.application.service;

import com.example.employement.application.dto.request.CompanyCreationRequest;
import com.example.employement.application.dto.response.CompanyResponse;
import com.example.employement.application.service.employee.IEmployeeCompanyService;
import com.example.employement.application.service.user.IUserCompanyService;
import com.example.employement.domain.repository.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyService implements IUserCompanyService, IEmployeeCompanyService {

    @Autowired
    private ICompanyRepository companyRepository;

    @Override
    public CompanyResponse getDetail(Long id) {
        return CompanyResponse.from(companyRepository.findById(id).orElseThrow());
    }

    @Override
    public CompanyResponse create(CompanyCreationRequest request) {
        return CompanyResponse.from(companyRepository.save(request.toEntity()));
    }

    @Override
    public CompanyResponse update(Long id, CompanyCreationRequest request) {
        return CompanyResponse.from(companyRepository.save(request.toEntity()));
    }

    @Override
    public boolean delete(Long id) {
        return companyRepository.deleteById(id);
    }
}
