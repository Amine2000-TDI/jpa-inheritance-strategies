package com.ezzahi.jpa_inheritance.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Personne {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
}
