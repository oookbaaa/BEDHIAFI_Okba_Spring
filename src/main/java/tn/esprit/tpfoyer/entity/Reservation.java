package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "T_reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rsv_id")
    private Long id;

    @Column(name = "rsv_anneeuniversitaire")
    private Date anneeuniversitaire;

    @Column(name = "rsv_validate_?")
    private Boolean estvalide;
}