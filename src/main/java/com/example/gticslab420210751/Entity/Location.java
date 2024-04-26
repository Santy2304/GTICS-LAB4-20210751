package com.example.gticslab420210751.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="locations")
public class Location {

    @Id
    @Column(name = "location_id")
    private int location_id;

    private String street_address;
    private String postal_code;
    private String city;
    private String state_province;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
