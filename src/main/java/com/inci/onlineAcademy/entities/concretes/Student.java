package com.inci.onlineAcademy.entities.concretes;

import com.inci.onlineAcademy.entities.abstracts.PersonBaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Map;


@Data
@Entity
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
public class Student extends PersonBaseEntity {

    @Column(name = "school_id")
    private String schoolId;

    @ManyToMany
    @JoinTable(
            name = "students_parents",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "parent_id")
    )
    private Map<Integer, Parent> parents;

    // TODO: tobe implemented lectures
}
