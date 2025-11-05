package com.example.location.service.implementation;

import com.example.location.entity.Reservation;
import com.example.location.service.inter.ReservationService;

import java.time.LocalDate;
import java.util.List;

public class ReservationServiceImpl implements ReservationService {
    @Override
    public List<Reservation> getAllReservations() {
        return List.of();
    }

    @Override
    public Reservation getReservationById(Long id) {
        return null;
    }

    @Override
    public Reservation createReservation(Long clientId, Long vehiculeId, LocalDate dateDebut, LocalDate dateFin) {
        return null;
    }

    @Override
    public void deleteReservation(Long id) {

    }

    @Override
    public double calculerMontantTotal(Reservation reservation) {
        return 0;
    }

    @Override
    public void annulerReservation(Long id) {

    }
}
