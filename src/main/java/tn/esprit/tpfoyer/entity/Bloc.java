package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "T_bloc")
@Getter
@Setter  // Apply setters for all fields except id
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = false, exclude = "id")  // Exclude id and attribute names in toString
@EqualsAndHashCode(exclude = "id")  // Exclude id from equals and hashCode
@FieldDefaults(level = AccessLevel.PRIVATE)  // All fields are private
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blc_id")
     Long id;

    @Column(name = "blc_nom")
     String nom;

    @Column(name = "blc_capacite")
     Long capacite;

    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    private Set<Chambre> chambres;

    @ManyToOne
    @JoinColumn(name = "foyer_id")
    private Foyer foyer;
}
