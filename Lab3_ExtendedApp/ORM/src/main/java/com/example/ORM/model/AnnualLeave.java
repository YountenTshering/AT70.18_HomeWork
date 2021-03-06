package com.example.ORM.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue(value = LeaveType.Values.ANNUAL)
public class AnnualLeave extends Leave {

    private int daysAllowed = 15;

    public AnnualLeave(Employee emp, boolean approved, String remarks, LocalDate from, LocalDate to) {
        super(emp, approved, remarks, from, to);
    }
}