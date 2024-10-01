package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.services.EtudiantService;

import java.util.Optional;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;  // Autowired service instance

    @GetMapping("/{id}")
    public ResponseEntity<Etudiant> getEtudiantById(@PathVariable Long id) {
        Optional<Etudiant> etudiant = etudiantService.findById(id); // Call on the service instance
        return etudiant.map(ResponseEntity::ok) // Return 200 OK with Etudiant if found
                .orElseGet(() -> ResponseEntity.notFound().build()); // Return 404 Not Found if not found
    }

    // Other CRUD methods (create, update, delete) can also be added here
}
