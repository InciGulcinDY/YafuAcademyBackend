package com.inci.onlineAcademy.entities.concretes;

import com.inci.onlineAcademy.entities.abstracts.PersonBaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Entity
@Table(name = "parents")
@AllArgsConstructor
@NoArgsConstructor
public class Parent extends PersonBaseEntity {

    @ManyToMany(mappedBy = "parents")
    private Map<Integer, Student> students;

}
