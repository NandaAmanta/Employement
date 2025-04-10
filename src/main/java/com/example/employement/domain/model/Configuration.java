package com.example.employement.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "configurations")
public class Configuration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String domain;

    @Column(name = "is_public")
    private boolean isPublic;

    private Integer paydayDatePerMonth;

    private Long companyId;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
