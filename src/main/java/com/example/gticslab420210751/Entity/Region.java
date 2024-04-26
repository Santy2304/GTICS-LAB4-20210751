package com.example.gticslab420210751.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.text.DecimalFormat;

@Entity
@Table(name="regions")
public class Region {

    @Id
    @Column(name = "region_id")
    private DecimalFormat region_id;

    private String region_name;

    public DecimalFormat getRegion_id() {
        return region_id;
    }

    public void setRegion_id(DecimalFormat region_id) {
        this.region_id = region_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }
}
