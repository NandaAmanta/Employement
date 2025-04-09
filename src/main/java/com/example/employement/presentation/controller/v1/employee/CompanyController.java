package com.example.employement.presentation.controller.v1.employee;

import com.example.employement.application.dto.request.CompanyCreationRequest;
import com.example.employement.application.dto.response.ApiResponse;
import com.example.employement.application.service.employee.IEmployeeCompanyService;
import com.example.employement.common.constant.RouteModuleV1Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(RouteModuleV1Constant.EMPLOYEE_COMPANY)
public class CompanyController {

    @Autowired
    private IEmployeeCompanyService companyService;

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse> getDetail(@PathVariable  Long id) {
        return ResponseEntity.ok(ApiResponse.success("Get company detail successfully", companyService.getDetail(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse> update(@PathVariable Long id,@RequestBody CompanyCreationRequest request) {
        return ResponseEntity.ok(ApiResponse.success("Update company successfully", companyService.update(id, request)));
    }
}
