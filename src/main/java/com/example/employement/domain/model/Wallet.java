package com.example.employement.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "wallets")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long companyId;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    private Integer balance;

    @Column(name = "admin_cost_per_month")
    private Integer adminCostPerMonth;
}
