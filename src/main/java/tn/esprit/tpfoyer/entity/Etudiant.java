package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "T_Etudiant")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etd_id")
    private Long id;

    @Column(name = "etd_nom")
    private String nom;

    @Column(name = "etd_prenom")
    private String Prenom;
    @Column(name = "etd_cin")
    private Long CIN;
    @Column(name = "etd_ecole")
    private String ecole;
    @Column(name = "etd_dob")
    private Date dob;
}