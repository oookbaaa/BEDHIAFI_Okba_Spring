package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "T_Chambre")
@Getter
@Setter  // Apply setters for all fields except id
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = false)  // Exclude id and attribute names in toString
@EqualsAndHashCode  // Exclude id from equals and hashCode
@FieldDefaults(level = AccessLevel.PRIVATE)  // All fields are private
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chb_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Setter(AccessLevel.NONE)
     Long id;

    @Column(name = "chb_num")
     Long num;

    @Column(name = "chb_type")
    @Enumerated(EnumType.STRING)
     TypeChambre typeC;
}
