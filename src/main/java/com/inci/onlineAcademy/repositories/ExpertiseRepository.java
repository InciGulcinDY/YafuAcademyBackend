package com.inci.onlineAcademy.repositories;

import com.inci.onlineAcademy.entities.concretes.Expertise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpertiseRepository extends JpaRepository<Expertise, Integer> {

    boolean existsByExpertise(String expertise);
}
