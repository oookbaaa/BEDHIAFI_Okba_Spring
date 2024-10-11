package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Table(name = "T_Etudiant")
@Getter
@Setter // Exclude id from setter methods
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString( exclude = "id" , includeFieldNames = false)  // Exclude id and attribute names
@EqualsAndHashCode(exclude = "id")  // Exclude id from equals and hashCode
@FieldDefaults(level = AccessLevel.PRIVATE)  // Make all fields private except nom (which will be protected)
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etd_id")
     @Setter(AccessLevel.NONE)
     Long id;

    @Column(name = "etd_nom")
      String nom;

    @Column(name = "etd_prenom")
      String prenom;

    @Column(name = "etd_cin")
      Long CIN;

    @Column(name = "etd_ecole")
      String ecole;

    @Column(name = "etd_dob")
      Date dob;
}
