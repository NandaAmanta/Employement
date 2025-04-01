package com.example.employement.domain.model;

import com.example.employement.domain.enums.EmployeeStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "password")
    private String password;

    @Column(name = "photo_path", nullable = true)
    private String photoPath;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private EmployeeStatus status;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}