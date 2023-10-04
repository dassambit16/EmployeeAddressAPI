package com.assignment.EmployeeAddress.Service;

import com.assignment.EmployeeAddress.Model.Address;
import com.assignment.EmployeeAddress.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;


    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return  "added!!";
    }

    public String addAddresses(List<Address> newAddresses) {
        addressRepo.saveAll(newAddresses);
        return newAddresses.size() + " are added!!";
    }

    public Address getAddress(Long id) {
        return addressRepo.findById(id).orElse(null);
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public String deleteAddressById(Long id) {
        addressRepo.deleteById(id);
        return "deleted!!";
    }
}
