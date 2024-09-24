package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "T_bloc")
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blc_id")
    private Long id;

    @Column(name = "blc_nom")
    private String nom;

    @Column(name = "blc_capacite")
    private Long capacite;
}