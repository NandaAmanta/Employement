package com.example.employement.infrastructure.persistence;

import com.example.employement.domain.model.Employee;
import com.example.employement.domain.repository.IEmployeeRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEmployeeRepository extends IEmployeeRepository,JpaRepository<Employee, Long> {

}