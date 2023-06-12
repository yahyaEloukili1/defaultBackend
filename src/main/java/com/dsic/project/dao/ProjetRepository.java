package com.dsic.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsic.project.enetities.Commune;
import com.dsic.project.enetities.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Integer> {

}
