package com.inci.onlineAcademy.entities.concretes;

import com.inci.onlineAcademy.entities.abstracts.PersonBaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Data
@Entity
@Table(name = "instructors")
@AllArgsConstructor
@NoArgsConstructor
public class Instructor extends PersonBaseEntity {

    @Column(name = "instructor_id")
    private String instructorId;

    @ManyToMany(mappedBy = "instructors")
    private Set<Expertise> expertises = new HashSet<>();

    @ManyToMany(mappedBy = "instructors")
    private Set<Lecture> lectures = new HashSet<>();


    // TODO: Weekly course plan


}
