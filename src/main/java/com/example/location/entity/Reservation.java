package com.example.location.entity;

import jakarta.persistence.ManyToOne;

import java.time.LocalDate;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private double montantTotal;

    @ManyToOne
    private Vehicule vehicule;

    @ManyToOne
    private Client client;
}

