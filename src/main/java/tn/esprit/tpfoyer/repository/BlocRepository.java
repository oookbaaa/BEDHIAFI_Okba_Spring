package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {

    @Query("SELECT b FROM Bloc b WHERE b.foyer.universites.nom LIKE %:keyword%")
    List<Bloc> findBlocsByUniversiteName(@Param("keyword") String keyword);
}
