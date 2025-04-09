package com.example.employement.application.dto.request;

import com.example.employement.domain.enums.CompanyStatus;
import com.example.employement.domain.model.Company;
import lombok.Data;

@Data
public class CompanyCreationRequest {

    private String name;

    private String address;

    private String logoPath;

    public Company toEntity() {
        Company company = new Company();
        company.setName(name);
        company.setAddress(address);
        company.setLogoPath(logoPath);
        company.setStatus(CompanyStatus.ACTIVE);
        return company;
    }

}
