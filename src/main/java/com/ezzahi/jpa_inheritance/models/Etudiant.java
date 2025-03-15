package com.ezzahi.jpa_inheritance.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data
@NoArgsConstructor
@DiscriminatorValue("ETU")
public class Etudiant extends Personne{
    private Double note;
    private String filier;
    public Etudiant(Long id,String nom, String prenom,Double note, String filier) {
        super(id,nom,prenom);
        this.note = note;
        this.filier = filier;
    }
}
