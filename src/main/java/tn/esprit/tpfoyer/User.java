package tn.esprit.tpfoyer;

import jakarta.persistence.*;

@Entity
@Table(name = "T_Etudiant")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etd_id")
    private Long id;

    @Column(name = "etd_nom")
    private String nom;

    @Column(name = "etd_prenom")
    private String prenom;

    // Constructors
    public User() {
    }

    public User(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }



}

