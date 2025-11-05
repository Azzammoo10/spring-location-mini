package com.example.location.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {
    private Long id;
    private String marque;
    private String modele;
    private double prixParJour;
    private boolean disponible;
}
