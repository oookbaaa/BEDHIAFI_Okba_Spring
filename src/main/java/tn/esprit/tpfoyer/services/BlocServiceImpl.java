package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.repository.BlocRepository;

@Service
public class BlocServiceImpl implements IBlocService {
    @Autowired
    private BlocRepository BlocRepository;
}
