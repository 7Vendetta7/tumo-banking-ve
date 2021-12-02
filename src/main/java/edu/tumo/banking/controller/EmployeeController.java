package edu.tumo.banking.controller;

import edu.tumo.banking.domain.bank.model.BankModel;
import edu.tumo.banking.domain.employee.model.EmployeeModel;
import edu.tumo.banking.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<EmployeeModel> addEmployee(@RequestBody EmployeeModel employee){
        return new ResponseEntity<>(employeeService.add(employee), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeModel>> findemployees(){
        List<EmployeeModel> employee = employeeService.findAll();
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeModel> findEmployeeById(@PathVariable Long id) {
        return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<BankModel> updateEmployee(@RequestBody EmployeeModel updatedEmployee){
        return new ResponseEntity<>(employeeService.update(updatedEmployee), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployeeById(@PathVariable Long id) {
        employeeService.deleteEmployeeModelById(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
