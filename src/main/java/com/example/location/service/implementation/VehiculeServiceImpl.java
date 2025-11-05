package com.example.location.service.implementation;

import com.example.location.entity.Vehicule;
import com.example.location.service.inter.VehiculeService;

import java.util.List;

public class VehiculeServiceImpl implements VehiculeService {
    @Override
    public List<Vehicule> getAllVehicules() {
        return List.of();
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return null;
    }

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return null;
    }

    @Override
    public Vehicule updateVehicule(Long id, Vehicule vehicule) {
        return null;
    }

    @Override
    public void deleteVehicule(Long id) {

    }

    @Override
    public List<Vehicule> getVehiculesDisponibles() {
        return List.of();
    }

    @Override
    public void setVehiculeDisponibilite(Long id, boolean disponible) {

    }
}
