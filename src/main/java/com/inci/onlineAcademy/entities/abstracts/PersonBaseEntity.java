package com.inci.onlineAcademy.entities.abstracts;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@Data
@MappedSuperclass
public abstract class PersonBaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @Column(name = "email", nullable = true)
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "phone", nullable = true)
    private String phone;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "updated_date", nullable = true)
    private LocalDate updatedDate;

    @Column(name = "deleted_date", nullable = true)
    private LocalDate deletedDate;

    @PrePersist
    private void beforeAdd() {
        createdDate = LocalDate.now();
    }

    @PreUpdate
    private void beforeUpdate() {
        updatedDate = LocalDate.now();
    }

    @PreRemove
    private void beforeDelete(){deletedDate = LocalDate.now();}

    public  Integer getAge(LocalDate birthdate){
        if (birthdate == null){
            return null;
        }
        LocalDate currentDate = LocalDate.now();
        return Period.between(LocalDate.from(birthdate), currentDate).getYears();
    }
}
