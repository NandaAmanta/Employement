package com.example.employement.application.dto.response;

import com.example.employement.domain.enums.CompanyStatus;
import com.example.employement.domain.model.Company;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CompanyResponse {

    private Long id;

    private String name;

    private String address;

    @JsonProperty("logo_path")
    private String logoPath;

    private CompanyStatus status;

    public static CompanyResponse from(Company company) {
        CompanyResponse companyResponse = new CompanyResponse();
        companyResponse.setId(company.getId());
        companyResponse.setName(company.getName());
        companyResponse.setAddress(company.getAddress());
        companyResponse.setLogoPath(company.getLogoPath());
        companyResponse.setStatus(company.getStatus());
        return companyResponse;
    }

}
