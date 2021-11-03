package edu.tumo.banking.controller.employee;

import edu.tumo.banking.service.address.AddressServiceImpl;
import edu.tumo.banking.service.employee.EmployeeServiceImpl;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/employee")
    Employee create(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping("/employee")
    Iterable<Employee> read(){
        return employeeService.findAll();
    }

    @PutMapping("/employee")
    Employee update(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/employee/{id}")
    void delete(@PathVariable Id id){
        employeeService.deleteById(id);
    }
}
