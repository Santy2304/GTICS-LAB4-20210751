package com.example.gticslab420210751.Repository;

import com.example.gticslab420210751.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
