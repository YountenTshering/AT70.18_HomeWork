package com.example.FinalExam.models;

import java.math.BigDecimal;
import java.util.List;

import javax.money.MonetaryAmount;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "This field is required")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    // @OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
    @OneToMany(mappedBy = "products")
    private List<Category> categories;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    @Transient
    private MonetaryAmount price_;

    private int stock;

}
