package com.inci.onlineAcademy.entities.concretes;

import com.inci.onlineAcademy.entities.abstracts.PersonBaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@Entity
@Table(name = "instructors")
@AllArgsConstructor
@NoArgsConstructor
public class Instructor extends PersonBaseEntity {

    @Column(name = "instructor_id")
    private String instructorId;

    @ManyToMany(mappedBy = "instructors")
    private Map<Integer, Expertise> expertises = new HashMap<>();

    // TODO: to be implemented lecture relation
    // TODO: Weekly course plan
    // TODO: Grades


}
