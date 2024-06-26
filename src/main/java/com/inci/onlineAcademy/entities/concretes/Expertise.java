package com.inci.onlineAcademy.entities.concretes;

import com.inci.onlineAcademy.entities.abstracts.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "expertises")
@AllArgsConstructor
@NoArgsConstructor
public class Expertise extends BaseEntity {
    @Column(name = "expertise")
    private String expertise;

    @ManyToMany
    @JoinTable(
            name = "expertises_instructors",
            joinColumns = @JoinColumn(name = "expertise_id"),
            inverseJoinColumns = @JoinColumn(name = "instructor_id")
    )
    private Set<Instructor> instructors = new HashSet<>();


}
