package edu.tumo.banking.controller.address;

import edu.tumo.banking.service.address.AddressServiceImpl;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressServiceImpl addressService;

    @PostMapping("/address")
    Address create(@RequestBody Address address){
        return addressService.save(address);
    }

    @GetMapping("/address")
    Iterable<Address> read(){
        return addressService.findAll();
    }

    @PutMapping("/address")
    Address update(@RequestBody Address address){
        return addressService.save(address);
    }

    @DeleteMapping("/address/{id}")
    void delete(@PathVariable Id id){
        addressService.deleteById(id);
    }


}

