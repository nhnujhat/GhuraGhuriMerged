package com.example.ghuraghuri.controller;

import com.example.ghuraghuri.model.Location;
import com.example.ghuraghuri.model.User;
import com.example.ghuraghuri.service.LocationService;
import com.example.ghuraghuri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.*;

import java.util.List;

@RestController
@RequestMapping("/location")
@CrossOrigin
public class LocationController {

    @Autowired
    LocationService locationService;

    @PostMapping("/add")
    public String addLocation(@RequestBody Location location){
        locationService.newLocation(location);
        return "New Location added";
    }

    @GetMapping("/getAll")
    public List<Location> getAllLocations(){
        return locationService.getAllLocations();
    }

    @GetMapping("/getById/id")
    public ResponseEntity<List<Location>> getById(@RequestParam int id){
        return new ResponseEntity<List<Location>>(locationService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/sortDown")
    public List<Location> getLocationsSortDown(){
        return locationService.findByOrderByNameAsc();
    }

    @GetMapping("/sortUp")
    public List<Location> getLocationsSortUp(){
        return locationService.findByOrderByNameDesc();
    }

    @GetMapping("/discoverSearchName/name")
    public ResponseEntity<List<Location>> searchLocationsName(@RequestParam String name){
        return new ResponseEntity<List<Location>>(locationService.findByNameContainingOrderByNameAsc(name), HttpStatus.OK);
    }

    @GetMapping("/discoverSearchNameUp/name")
    public ResponseEntity<List<Location>> searchLocationsNameUp(@RequestParam String name){
        return new ResponseEntity<List<Location>>(locationService.findByNameContainingOrderByNameDesc(name), HttpStatus.OK);
    }

    @GetMapping("/discoverSearchDivision/division")
    public ResponseEntity<List<Location>> searchLocationsDivision(@RequestParam String division){
        return new ResponseEntity<List<Location>>(locationService.findByDivisionOrderByNameAsc(division), HttpStatus.OK);
    }

    @GetMapping("/discoverSearchDivisionUp/division")
    public ResponseEntity<List<Location>> searchLocationsDivisionUp(@RequestParam String division){
        return new ResponseEntity<List<Location>>(locationService.findByDivisionOrderByNameDesc(division), HttpStatus.OK);
    }

    @GetMapping("/discoverSearchType/type")
    public ResponseEntity<List<Location>> searchLocationsType(@RequestParam String type){
        return new ResponseEntity<List<Location>>(locationService.findByTypeOrderByNameAsc(type), HttpStatus.OK);
    }

    @GetMapping("/discoverSearchTypeUp/type")
    public ResponseEntity<List<Location>> searchLocationsTypeUp(@RequestParam String type){
        return new ResponseEntity<List<Location>>(locationService.findByTypeOrderByNameDesc(type), HttpStatus.OK);
    }

    @GetMapping("/discoverSearchNameDivision/namedivision")
    public ResponseEntity<List<Location>> searchLocationsNameDivision(@RequestParam String name, @RequestParam String division){
        return new ResponseEntity<List<Location>>(locationService.findByNameContainingAndDivisionOrderByNameAsc(name, division), HttpStatus.OK);
    }

    @GetMapping("/discoverSearchNameDivisionUp/namedivision")
    public ResponseEntity<List<Location>> searchLocationsNameDivisionUp(@RequestParam String name, @RequestParam String division){
        return new ResponseEntity<List<Location>>(locationService.findByNameContainingAndDivisionOrderByNameDesc(name, division), HttpStatus.OK);
    }

    @GetMapping("/discoverSearchNameType/nametype")
    public ResponseEntity<List<Location>> searchLocationsNameType(@RequestParam String name, @RequestParam String type){
        return new ResponseEntity<List<Location>>(locationService.findByNameContainingAndTypeOrderByNameAsc(name, type), HttpStatus.OK);
    }

    @GetMapping("/discoverSearchNameTypeUp/nametype")
    public ResponseEntity<List<Location>> searchLocationsNameTypeUp(@RequestParam String name, @RequestParam String type){
        return new ResponseEntity<List<Location>>(locationService.findByNameContainingAndTypeOrderByNameDesc(name, type), HttpStatus.OK);
    }


    @GetMapping("/discoverSearchDivisionType/divisiontype")
    public ResponseEntity<List<Location>> searchLocationsTypeAndDivision(@RequestParam String division, @RequestParam String type){
        return new ResponseEntity<List<Location>>(locationService.findByDivisionAndTypeOrderByNameAsc(division,type), HttpStatus.OK);
    }

    @GetMapping("/discoverSearchDivisionTypeUp/divisiontype")
    public ResponseEntity<List<Location>> searchLocationsTypeAndDivisionUp(@RequestParam String division, @RequestParam String type){
        return new ResponseEntity<List<Location>>(locationService.findByDivisionAndTypeOrderByNameDesc(division,type), HttpStatus.OK);
    }

    @GetMapping("/discoverSearchNameDivisionType/namedivisiontype")
    public ResponseEntity<List<Location>> searchLocationsNameDivisionType(@RequestParam String name, @RequestParam String division, @RequestParam String type){
        return new ResponseEntity<List<Location>>(locationService.findByNameContainingAndDivisionAndTypeOrderByNameAsc(name, division, type), HttpStatus.OK);
    }

    @GetMapping("/discoverSearchNameDivisionTypeUp/namedivisiontype")
    public ResponseEntity<List<Location>> searchLocationsNameDivisionTypeUp(@RequestParam String name, @RequestParam String division, @RequestParam String type){
        return new ResponseEntity<List<Location>>(locationService.findByNameContainingAndDivisionAndTypeOrderByNameDesc(name, division, type), HttpStatus.OK);
    }
}
