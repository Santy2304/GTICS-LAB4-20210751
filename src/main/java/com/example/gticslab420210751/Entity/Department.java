package com.example.gticslab420210751.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="departments")
public class Department {

    @Id
    @Column(name = "department_id")
    private int department_id;

    private String department_name;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
