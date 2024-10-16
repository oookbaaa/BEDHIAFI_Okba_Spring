package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tpfoyer.services.IReservationService;
import tn.esprit.tpfoyer.services.ReservationServiceImpl;

@RestController
public class ReservationController {
    @Autowired
    private IReservationService reservationService;
}
