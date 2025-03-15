package com.ezzahi.jpa_inheritance;

import com.ezzahi.jpa_inheritance.dao.PersonneRepository;
import com.ezzahi.jpa_inheritance.models.Etudiant;
import com.ezzahi.jpa_inheritance.models.Personne;
import com.ezzahi.jpa_inheritance.models.Professuer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaInheritanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaInheritanceApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(PersonneRepository personneRepository) {
        return args -> {
            // Sauvegarde un étudiant dans la base de données
            personneRepository.save(new Personne(null,"John", "Doe"));
            personneRepository.save(new Etudiant(null,"ali","amil",11D,"svt"));
            personneRepository.save(new Professuer(null,"Jane", "Doe",5000D,"casa"));
        };
    }
}
