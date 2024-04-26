package com.example.gticslab420210751.Controller;

import com.example.gticslab420210751.Repository.EmployeeRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    final EmployeeRepository employeeRepository;
    public Controller(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;

    }

    @GetMapping("/RecursosHumanos–GTICS")
    public String recursosHumanos() {
        return "RecursosHumanos";
    }


    @GetMapping("/EmpleadosTotales")
    public String listar(Model model) {

        model.addAttribute("listaEmpleados", employeeRepository.findAll());
        return "Empleados/EmpleadosTotales";
    }


}
