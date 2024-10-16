package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tpfoyer.services.IUniversiteService;
import tn.esprit.tpfoyer.services.UniversiteServiceImpl;

@RestController
public class UniversiteController {

    @Autowired
    private IUniversiteService universiteService;
}
