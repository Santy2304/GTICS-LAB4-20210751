package com.example.gticslab420210751.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="job_history")
public class Job_history {


    @Id
    @Column(name = "job_history_id")
    private int job_history_id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    private Date start_date;

    private Date end_date;


    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public int getJob_history_id() {
        return job_history_id;
    }

    public void setJob_history_id(int job_history_id) {
        this.job_history_id = job_history_id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
