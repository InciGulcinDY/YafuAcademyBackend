package com.inci.onlineAcademy.repositories;

import com.inci.onlineAcademy.entities.concretes.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
