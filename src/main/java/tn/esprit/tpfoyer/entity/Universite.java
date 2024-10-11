package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "T_universite")
@Getter
@Setter  // Apply setters for all fields except id
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = false, exclude = "id")  // Exclude id and attribute names in toString
@EqualsAndHashCode(exclude = "id")  // Exclude id from equals and hashCode
@FieldDefaults(level = AccessLevel.PRIVATE)  // All fields are private
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unv_id")
    @Setter(AccessLevel.NONE)
     Long id;

    @Column(name = "unv_nom")
     String nom;

    @Column(name = "unv_adresse")
     String adresse;

    @OneToOne
    private Foyer foyer;
}
