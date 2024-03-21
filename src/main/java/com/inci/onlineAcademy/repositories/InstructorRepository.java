package com.inci.onlineAcademy.repositories;

import com.inci.onlineAcademy.entities.concretes.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
}
