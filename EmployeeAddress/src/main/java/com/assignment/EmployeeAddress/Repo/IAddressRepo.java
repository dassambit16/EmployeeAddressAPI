package com.assignment.EmployeeAddress.Repo;

import com.assignment.EmployeeAddress.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Long> {

}
