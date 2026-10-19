package tn.esprit.autoloc.autoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc.domain.Reservation;
import tn.esprit.autoloc.autoloc.service.IReservationService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")
@Tag(name="gestion de reservation" , description="Crud")
public class ReservationController {
    private final IReservationService reservationservice;

    @GetMapping("/afficherToutesReservations")
    public List<Reservation> getAllReservations() {
        return reservationservice.afficherAllReservations();
    }


    @Operation(summary="Ajouter Reservation")
    @PostMapping("/Ajouterreservation")
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return reservationservice.ajouterReservation(reservation);
    }

    @PutMapping("/Modifierreservation")
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return reservationservice.modifierReservation(reservation);
    }


    @GetMapping("/AfficherReservation/{id}")
    public Reservation afficherReservation(@PathVariable Long id) {
        return reservationservice.afficherReservationById(id);
    }

    @DeleteMapping("/SupprimerReservation/{id}")
    public void supprimerReservation(@PathVariable Long id) {
        reservationservice.supprimerReservation(id);
    }

}