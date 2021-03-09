package com.example.MidExam.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.money.Monetary;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ch.qos.logback.classic.Level;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private int id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Level level;

    private LocalDate birthday;

    @Transient
    private Date birthday_;

    @Transient
    private Monetary baseSalary;

    @Column(name = "Generated", precision = 10, scale = 2)
    private BigDecimal baseSalary_;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "emp", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Address> addresses;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonIgnore
    @MapsId
    private User user;

    public void setEmployee(List<User> users) {
    }

    public Date getDOB_() {
        return null;
    }

    public void setDOB(LocalDate convertToEntityAttribute) {
    }

}
