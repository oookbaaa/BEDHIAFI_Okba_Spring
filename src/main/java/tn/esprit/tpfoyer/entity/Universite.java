package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "T_universite")
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unv_id")
    private Long id;

    @Column(name = "unv_nom")
    private String nom;

    @Column(name = "unv_adresse")
    private String adresse;
}