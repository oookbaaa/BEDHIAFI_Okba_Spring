package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "T_Chambre")
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chb_id")
    private Long id;

    @Column(name = "chb_num")
    private Long num;

    @Column(name = "chb_type")
    private TypeChambre typeC;
}