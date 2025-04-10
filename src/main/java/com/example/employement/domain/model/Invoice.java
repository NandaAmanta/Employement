package com.example.employement.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long companyId;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "paid_at", nullable = true)
    private Date paidAt;

    @Column(name = "tax_amount")
    private Integer taxAmount;

    @Column(name = "subtotal_price")
    private Integer subTotalPrice;

    @Column(name = "discount_amount")
    private Integer discountAmount;

    @Column(name = "admin_cost")
    private Integer adminCost;

    @Column(name = "total_price")
    private Integer totalPrice;

}
