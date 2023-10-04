package com.assignment.EmployeeAddress.Controller;

import com.assignment.EmployeeAddress.Model.Address;
import com.assignment.EmployeeAddress.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress) {
        return addressService.addAddress(newAddress);
    }

    @PostMapping("addresses")
    public String addAddresses(@RequestBody List<Address> newAddresses) {
        return addressService.addAddresses(newAddresses);
    }

    @GetMapping("address/{id}")
    public Address getAddress(@PathVariable Long id) {
        return addressService.getAddress(id);
    }

    @GetMapping("addresses")
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }
    @DeleteMapping("address/{id}")
    public String deleteAddressById(@PathVariable Long id) {
        return addressService.deleteAddressById(id);
    }

}
