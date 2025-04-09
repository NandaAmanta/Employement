package com.example.employement.application.service.employee;

import com.example.employement.application.dto.request.CompanyCreationRequest;
import com.example.employement.application.dto.response.CompanyResponse;

public interface IEmployeeCompanyService {
    public CompanyResponse getDetail(Long id);

    public CompanyResponse update(Long id, CompanyCreationRequest request);
}