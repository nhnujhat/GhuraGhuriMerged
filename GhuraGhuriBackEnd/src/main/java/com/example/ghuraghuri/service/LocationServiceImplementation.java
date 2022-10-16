package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Location;
import com.example.ghuraghuri.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Service
public class LocationServiceImplementation implements LocationService{

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    EntityManager entityManager;

    @Override
    public Location newLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public List<Location> findById(int id) {
        return locationRepository.findById(id);
    }

    @Override
    public List<Location> findByOrderByNameAsc() {
        return locationRepository.findByOrderByNameAsc();
    }

    @Override
    public List<Location> findByOrderByNameDesc() {
        return locationRepository.findByOrderByNameDesc();
    }

    @Override
    public List<Location> findByNameContainingOrderByNameAsc(String name) {
        return locationRepository.findByNameContainingOrderByNameAsc(name);
    }

    @Override
    public List<Location> findByNameContainingOrderByNameDesc(String name) {
        return locationRepository.findByNameContainingOrderByNameDesc(name);
    }

    @Override
    public List<Location> findByDivisionOrderByNameAsc(String division) {
        return locationRepository.findByDivisionOrderByNameAsc(division);
    }
    @Override
    public List<Location> findByDivisionOrderByNameDesc(String division) {
        return locationRepository.findByDivisionOrderByNameDesc(division);
    }

    @Override
    public List<Location> findByTypeOrderByNameAsc(String type) {
        return locationRepository.findByTypeOrderByNameAsc(type);
    }

    @Override
    public List<Location> findByTypeOrderByNameDesc(String type) {
        return locationRepository.findByTypeOrderByNameDesc(type);
    }

    @Override
    public List<Location> findByNameContainingAndDivisionOrderByNameAsc(String name, String division) {
        return locationRepository.findByNameContainingAndDivisionOrderByNameAsc(name, division);
    }

    @Override
    public List<Location> findByNameContainingAndDivisionOrderByNameDesc(String name, String division) {
        return locationRepository.findByNameContainingAndDivisionOrderByNameDesc(name, division);
    }

    @Override
    public List<Location> findByNameContainingAndTypeOrderByNameAsc(String name, String type) {
        return locationRepository.findByNameContainingAndTypeOrderByNameAsc(name, type);
    }

    @Override
    public List<Location> findByNameContainingAndTypeOrderByNameDesc(String name, String type) {
        return locationRepository.findByNameContainingAndTypeOrderByNameDesc(name, type);
    }

    @Override
    public List<Location> findByDivisionAndTypeOrderByNameAsc(String division, String type) {
        return locationRepository.findByDivisionAndTypeOrderByNameAsc(division, type);
    }

    @Override
    public List<Location> findByDivisionAndTypeOrderByNameDesc(String division, String type) {
        return locationRepository.findByDivisionAndTypeOrderByNameDesc(division, type);
    }

    @Override
    public List<Location> findByNameContainingAndDivisionAndTypeOrderByNameAsc(String name, String division, String type) {
        return locationRepository.findByNameContainingAndDivisionAndTypeOrderByNameAsc(name, division, type);
    }

    @Override
    public List<Location> findByNameContainingAndDivisionAndTypeOrderByNameDesc(String name, String division, String type) {
        return locationRepository.findByNameContainingAndDivisionAndTypeOrderByNameDesc(name, division, type);
    }





    /*@Override
    public List<Location> getLocationsSortDown() {
        ArrayList<Location> results = (ArrayList<Location>) entityManager.createNativeQuery("SELECT * FROM location ORDER BY location.name ASC").getResultList();
        return results;
    }

    @Override
    public List<Location> getLocationsSortUp() {
        ArrayList<Location> results = (ArrayList<Location>) entityManager.createNativeQuery("SELECT * FROM location ORDER BY location.name DESC").getResultList();
        return results;
    }

    @Override
    public List<Location> searchLocationsName(String name) {
        /*
        String query = "SELECT * FROM location WHERE name LIKE '%" + Name + "%' ORDER BY name ASC";
        List<Location> results = entityManager.createNativeQuery(query).getResultList();
        return results;

        return locationRepository.findByNameContaining(name);
    }

    @Override
    public List<Location> searchLocationsDivision(String Division) {
        /*
        String query = "SELECT * FROM location WHERE division LIKE '%" + Division + "%' ORDER BY name ASC";
        List<Location> results = entityManager.createNativeQuery(query).getResultList();
        return results;

        return locationRepository.findByDivisionContaining(Division);
    }

    @Override
    public List<Location> searchLocationsType() {
        return locationRepository.findAll();
    }

    @Override
    public List<Location> searchLocationsNameDivision() {
        return locationRepository.findAll();
    }

    @Override
    public List<Location> searchLocationsNameType() {
        return locationRepository.findAll();
    }

    @Override
    public List<Location> searchLocationsDivisionType() {
        return locationRepository.findAll();
    }

    @Override
    public List<Location> searchLocationsNameDivisionType() {
        return locationRepository.findAll();
    }*/
}
