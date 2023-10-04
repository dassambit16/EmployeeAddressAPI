package com.assignment.EmployeeAddress.Service;

import com.assignment.EmployeeAddress.Model.Employee;
import com.assignment.EmployeeAddress.Repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "added!!";
    }

    public String addEmployees(List<Employee> employeeList) {
        employeeRepo.saveAll(employeeList);
        return employeeList.size() + " employees are added";
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public String deleteEmployeeById(Integer id) {
        employeeRepo.deleteById(id);
        return "deleted!!";
    }
}
