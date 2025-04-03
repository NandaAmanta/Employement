package com.example.employement.domain.repository;

import com.example.employement.domain.model.Employee;

import java.util.Optional;

public interface IEmployeeRepository {

    Optional<Employee> findById(Long id);

    Employee save(Employee employee);

}
