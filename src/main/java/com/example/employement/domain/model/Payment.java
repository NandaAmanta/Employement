package com.example.employement.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "invoice_id")
    private Long invoiceId;

    @OneToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    private Integer amount;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "return_amount")
    private Integer returnAmount;
}
