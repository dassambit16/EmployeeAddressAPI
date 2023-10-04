package com.assignment.EmployeeAddress.Repo;

import com.assignment.EmployeeAddress.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
