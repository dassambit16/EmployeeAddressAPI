package com.assignment.EmployeeAddress.Controller;

import com.assignment.EmployeeAddress.Model.Employee;
import com.assignment.EmployeeAddress.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("employee")
    public String addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    @PostMapping("employees")
    public String addEmployees(@RequestBody List<Employee> employeeList) {
        return employeeService.addEmployees(employeeList);
    }
    @GetMapping("employee/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }
    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @DeleteMapping("employee/{id}")
    public String deleteEmployeeById(@PathVariable Integer id) {
        return employeeService.deleteEmployeeById(id);
    }
}
