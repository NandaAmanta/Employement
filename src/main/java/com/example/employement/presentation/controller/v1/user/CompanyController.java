package com.example.employement.presentation.controller.v1.user;

import com.example.employement.application.dto.request.CompanyCreationRequest;
import com.example.employement.application.dto.response.ApiResponse;
import com.example.employement.application.service.user.IUserCompanyService;
import com.example.employement.common.constant.RouteModuleV1Constant;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(RouteModuleV1Constant.USER_COMPANY)
public class CompanyController {

    @Autowired
    private IUserCompanyService companyService;

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse> getDetail(@PathVariable Long id) {
        return ResponseEntity.ok(ApiResponse.success("Get company detail successfully", companyService.getDetail(id)));
    }

    @PostMapping()
    public ResponseEntity<ApiResponse> create(@RequestBody @Valid CompanyCreationRequest request) {
        return ResponseEntity.ok(ApiResponse.success("Company created successfully", companyService.create(request)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse> update(@PathVariable Long id,@RequestBody CompanyCreationRequest request) {
        return ResponseEntity.ok(ApiResponse.success("Update company successfully", companyService.update(id, request)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> delete(@PathVariable Long id) {
        return ResponseEntity.ok(ApiResponse.success("Delete company successfully", companyService.delete(id)));
    }

}


