package com.example.gticslab420210751.Entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DecimalFormat;
import java.util.Date;

@Entity
@Table(name="employees")
public class Employee {

        @Id
        @Column(name = "employee_id")
        private int employee_id;
        private String first_name;

        private String last_name;

        private String email;
        private String password;
        private String phone_number;
        private Date hire_date;

        @ManyToOne
        @JoinColumn(name = "job_id")
        private Job job;

        private DecimalFormat salary;

        private DecimalFormat commission_pct;

        private  int enabled;

        @ManyToOne
        @JoinColumn(name = "department_id")
        private  Department department;

        @ManyToOne
        @JoinColumn(name = "manager_id")
        private Employee employee;

        public int getEmployee_id() {
                return employee_id;
        }

        public void setEmployee_id(int employee_id) {
                this.employee_id = employee_id;
        }

        public String getFirst_name() {
                return first_name;
        }

        public void setFirst_name(String first_name) {
                this.first_name = first_name;
        }

        public String getLast_name() {
                return last_name;
        }

        public void setLast_name(String last_name) {
                this.last_name = last_name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getPhone_number() {
                return phone_number;
        }

        public void setPhone_number(String phone_number) {
                this.phone_number = phone_number;
        }

        public Date getHire_date() {
                return hire_date;
        }

        public void setHire_date(Date hire_date) {
                this.hire_date = hire_date;
        }

        public Job getJob() {
                return job;
        }

        public void setJob(Job job) {
                this.job = job;
        }

        public DecimalFormat getSalary() {
                return salary;
        }

        public void setSalary(DecimalFormat salary) {
                this.salary = salary;
        }

        public DecimalFormat getCommission_pct() {
                return commission_pct;
        }

        public void setCommission_pct(DecimalFormat commission_pct) {
                this.commission_pct = commission_pct;
        }

        public int getEnabled() {
                return enabled;
        }

        public void setEnabled(int enabled) {
                this.enabled = enabled;
        }

        public Department getDepartment() {
                return department;
        }

        public void setDepartment(Department department) {
                this.department = department;
        }

        public Employee getEmployee() {
                return employee;
        }

        public void setEmployee(Employee employee) {
                this.employee = employee;
        }
}
