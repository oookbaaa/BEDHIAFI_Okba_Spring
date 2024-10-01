package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Date;

@Entity
@Table(name = "T_reservation")
@Getter
@Setter  // Apply setters for all fields except id
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true, doNotUseGetters = true)  // Exclude id and attribute names in toString
@EqualsAndHashCode(exclude = "id")  // Exclude id from equals and hashCode
@FieldDefaults(level = AccessLevel.PRIVATE)  // All fields are private
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rsv_id")
    @ToString.Exclude
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "rsv_anneeuniversitaire")
    @ToString.Include(rank = 1)
    private Date anneeuniversitaire;

    @Column(name = "rsv_validate_?")
    @ToString.Include(rank = 2)
    private Boolean estvalide;
}
