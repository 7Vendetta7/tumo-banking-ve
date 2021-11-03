package edu.tumo.banking.controller.bank;

import edu.tumo.banking.service.address.AddressServiceImpl;
import edu.tumo.banking.service.bank.BankServiceImpl;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@RestController
@RequestMapping("/bank")
public class BankController {
    @Autowired
    BankServiceImpl bankService;

    @PostMapping("/bank")
    Bank create(@RequestBody Bank bank){
        return bankService.save(bank);
    }

    @GetMapping("/bank")
    Iterable<Bank> read(){
        return addressService.findAll();
    }

    @PutMapping("/bank")
    Bank update(@RequestBody Bank bank){
        return bankService.save(bank);
    }

    @DeleteMapping("/bank/{id}")
    void delete(@PathVariable Id id){
        bankService.deleteById(id);
    }
}
