package com.inci.onlineAcademy.repositories;

import com.inci.onlineAcademy.entities.concretes.LectureCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureCategoryRepository extends JpaRepository<LectureCategory, Integer> {
}
