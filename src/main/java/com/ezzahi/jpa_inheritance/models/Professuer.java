package com.ezzahi.jpa_inheritance.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Professuer extends Personne{
    private Double salary;
    private String adresse;
    public Professuer(Long id,String nom, String prenom,Double salary, String adresse) {
        super(id,nom,prenom);
        this.salary = salary;
        this.adresse = adresse;
    }
}
