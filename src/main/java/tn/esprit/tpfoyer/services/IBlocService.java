package tn.esprit.tpfoyer.services;


import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;

public interface IBlocService {

    Bloc create(Bloc bloc);
    Bloc update(Bloc bloc);
    String delete(Long id);
    Bloc readById(Long id);
    List<Bloc> readAll();
    List<Bloc> findBlocsByUniversiteName(String keyword);
}
