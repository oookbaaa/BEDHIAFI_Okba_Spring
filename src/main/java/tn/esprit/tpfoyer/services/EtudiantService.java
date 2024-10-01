package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.services.EtudiantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;



    // Retrieve all Etudiants
    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();


    }

    // Find an Etudiant by ID
    public Optional<Etudiant> findById(Long id) {
        return etudiantRepository.findById(id);
    }

    // Create a new Etudiant
    public Etudiant create(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    // Update an existing Etudiant
    public Etudiant update(Long id, Etudiant etudiantDetails) {
        Etudiant etudiant = etudiantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Etudiant not found with id " + id));

//        etudiant.setNom(etudiantDetails.getNom());
        etudiant.setPrenom(etudiantDetails.getPrenom());
        etudiant.setCIN(etudiantDetails.getCIN());
        etudiant.setEcole(etudiantDetails.getEcole());
        etudiant.setDob(etudiantDetails.getDob());

        return etudiantRepository.save(etudiant);
    }

    // Delete an Etudiant
    public void delete(Long id) {
        Etudiant etudiant = etudiantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Etudiant not found with id " + id));
        etudiantRepository.delete(etudiant);
    }
}
