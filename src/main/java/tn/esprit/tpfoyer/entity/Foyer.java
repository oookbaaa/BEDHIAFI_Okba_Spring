package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "T_Foyer")
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fyr_id")
    private Long id;

    @Column(name = "fyr_nom")
    private String nom;

    @Column(name = "fyr_capacite")
    private Long capacite;
}

