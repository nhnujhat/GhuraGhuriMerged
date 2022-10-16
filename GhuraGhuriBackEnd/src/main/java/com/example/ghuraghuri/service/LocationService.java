package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Location;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationService {
    public Location newLocation(Location location);
    public List<Location> getAllLocations();
    public List<Location> findById(int id);
    public List<Location> findByOrderByNameAsc();
    public List<Location> findByOrderByNameDesc();
    List<Location> findByNameContainingOrderByNameAsc(String name);
    List<Location> findByNameContainingOrderByNameDesc(String name);
    List<Location> findByDivisionOrderByNameAsc(String division);
    List<Location> findByDivisionOrderByNameDesc(String division);
    List<Location> findByTypeOrderByNameAsc(String division);
    List<Location> findByTypeOrderByNameDesc(String division);
    List<Location> findByNameContainingAndDivisionOrderByNameAsc(String name, String division);
    List<Location> findByNameContainingAndDivisionOrderByNameDesc(String name, String division);
    List<Location> findByNameContainingAndTypeOrderByNameAsc(String name, String type);
    List<Location> findByNameContainingAndTypeOrderByNameDesc(String name, String type);
    List<Location> findByDivisionAndTypeOrderByNameAsc(String division, String type);
    List<Location> findByDivisionAndTypeOrderByNameDesc(String division, String Type);
    List<Location> findByNameContainingAndDivisionAndTypeOrderByNameAsc(String name, String division, String type);
    List<Location> findByNameContainingAndDivisionAndTypeOrderByNameDesc(String name, String division, String type);
}
