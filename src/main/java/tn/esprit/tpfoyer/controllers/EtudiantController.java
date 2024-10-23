package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.services.EtudiantServiceImpl;
import tn.esprit.tpfoyer.services.IEtudiantService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {

    @Autowired
    private IEtudiantService etudiantService;  // Autowired service instance

    @GetMapping("/etd")
    @ResponseBody
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.findAll();

    }


    @GetMapping("/etd/{id}")
    public ResponseEntity<Etudiant> getEtudiantById(@PathVariable Long id) {
        Optional<Etudiant> etudiant = etudiantService.findById(id); // Call on the service instance
        return etudiant.map(ResponseEntity::ok) // Return 200 OK with Etudiant if found
                .orElseGet(() -> ResponseEntity.notFound().build()); // Return 404 Not Found if not found
    }

    @PostMapping("/add")
    @ResponseBody
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.create(e);

    }




    // Other CRUD methods (create, update, delete) can also be added here
}
