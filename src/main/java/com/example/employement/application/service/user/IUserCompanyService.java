package com.example.employement.application.service.user;

import com.example.employement.application.dto.request.CompanyCreationRequest;
import com.example.employement.application.dto.response.CompanyResponse;

public interface IUserCompanyService {
    public CompanyResponse getDetail(Long id);

    public CompanyResponse create(CompanyCreationRequest request);

    public CompanyResponse update(Long id, CompanyCreationRequest request);

    public boolean delete(Long id);
}
