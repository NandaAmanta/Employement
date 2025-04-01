package com.example.employement.domain.model;

import com.example.employement.domain.enums.CompanyStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "companies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    @Column(name = "logo_path", nullable = true)
    private String logoPath;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private CompanyStatus status;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private List<Employee> employees;
}