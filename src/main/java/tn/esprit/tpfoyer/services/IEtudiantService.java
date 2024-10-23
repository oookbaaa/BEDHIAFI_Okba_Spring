package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;
import java.util.Optional;

public interface IEtudiantService {

    // Retrieve all Etudiants
    List<Etudiant> findAll();

    // Find an Etudiant by ID
    Optional<Etudiant> findById(Long id);

    // Delete an Etudiant
    void delete(Long id);

    // Update an existing Etudiant
    Etudiant update(Long id, Etudiant etudiantDetails);

    //create an Etudiant
    Etudiant create(Etudiant etudiant);
}
