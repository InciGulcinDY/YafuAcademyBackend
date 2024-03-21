package com.inci.onlineAcademy.repositories;

import com.inci.onlineAcademy.entities.concretes.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Integer> {
}
