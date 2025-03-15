package com.ezzahi.jpa_inheritance.dao;

import com.ezzahi.jpa_inheritance.models.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
