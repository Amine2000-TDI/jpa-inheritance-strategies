package com.ezzahi.jpa_inheritance.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor
@AllArgsConstructor @Builder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
@DiscriminatorValue("PERSONNE")
public class Personne {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
}
