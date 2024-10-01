package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter  // Apply setters for all fields except id
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "id",includeFieldNames = false)  // Exclude id and attribute names in toString
@EqualsAndHashCode(exclude = "id")  // Exclude id from equals and hashCode
@FieldDefaults(level = AccessLevel.PRIVATE)  // All fields are private
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etd_id")
     @Setter(AccessLevel.NONE)  // Exclude id from having a setter
      Long id;

    @Column(name = "etd_nom")
       String nom;

    @Column(name = "etd_prenom")
       String prenom;
}
