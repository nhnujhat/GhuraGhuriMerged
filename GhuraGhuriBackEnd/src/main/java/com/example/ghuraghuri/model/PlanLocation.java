package com.example.ghuraghuri.model;

import javax.persistence.*;

@Entity
@Table(name="planlocation")
public class PlanLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long planId;
    private Long locationId;
    private String locationName;

    public PlanLocation(Long planId, Long locationId, String locationName) {
        this.planId = planId;
        this.locationId = locationId;
        this.locationName = locationName;
    }

    public PlanLocation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
