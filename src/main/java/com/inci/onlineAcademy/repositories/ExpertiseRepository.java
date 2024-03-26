package com.inci.onlineAcademy.repositories;

import com.inci.onlineAcademy.entities.concretes.Expertise;
import com.inci.onlineAcademy.services.constants.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpertiseRepository extends JpaRepository<Expertise, Integer> {

    boolean existsByExpertise(String expertise);

    Expertise findByExpertise(String expertise);
}
