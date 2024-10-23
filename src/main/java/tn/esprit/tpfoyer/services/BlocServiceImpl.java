package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.repository.BlocRepository;

import java.util.List;

@Service
public class BlocServiceImpl implements IBlocService {
    @Autowired
    BlocRepository blocRepo;


    @Override
    public Bloc readById(Long id) {
        return blocRepo.findById(id).orElse(new Bloc());
    }

    @Override
    public List<Bloc> readAll() {
        return blocRepo.findAll();
    }


    @Override
    public Bloc create(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc update(Bloc bloc) {
        return blocRepo.save(bloc);
    }


    @Override
    public String delete(Long id) {
        if (blocRepo.existsById(id)) {
            blocRepo.deleteById(id);
            return("suppression avec succés");
        }else {
            return("suppression échoue");
        }
    }


    public List<Bloc> findBlocsByUniversiteName(String keyword) {
        return blocRepo.findBlocsByUniversiteName(keyword);
    }

}
