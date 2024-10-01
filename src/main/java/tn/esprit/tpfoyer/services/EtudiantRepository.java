package tn.esprit.tpfoyer.services;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    // Additional query methods can be defined here if needed
}
