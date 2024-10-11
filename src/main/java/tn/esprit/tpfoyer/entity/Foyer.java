package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "T_Foyer")
@Getter
@Setter  // Apply setters for all fields except id
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = false)  // Exclude id and attribute names in toString
@EqualsAndHashCode(exclude = "id")  // Exclude id from equals and hashCode
@FieldDefaults(level = AccessLevel.PRIVATE)  // All fields are private
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fyr_id")
    @ToString.Exclude
    @Setter(AccessLevel.NONE)
      Long id;

    @Column(name = "fyr_nom")
       String nom;

    @Column(name = "fyr_capacite")
       Long capacite;
}
