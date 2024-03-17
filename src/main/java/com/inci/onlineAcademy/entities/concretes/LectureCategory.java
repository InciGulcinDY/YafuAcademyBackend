package com.inci.onlineAcademy.entities.concretes;

import com.inci.onlineAcademy.entities.abstracts.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "lecture_category")
@AllArgsConstructor
@NoArgsConstructor
public class LectureCategory extends BaseEntity {

    @Column(name = "category")
    private String category;

    @OneToMany(mappedBy = "category")
    private List<Lecture> lectures;

}
