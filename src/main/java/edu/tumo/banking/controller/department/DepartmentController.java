package edu.tumo.banking.controller.department;

import edu.tumo.banking.service.address.AddressServiceImpl;
import edu.tumo.banking.service.department.DepartmentServiceImpl;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@RestController
@RequestMapping("/department")
public class DepartmentController {


    @Autowired
    DepartmentServiceImpl departmentService;

    @PostMapping("/department")
    Department create(@RequestBody Department department){
        return departmentService.save(department);
    }

    @GetMapping("/department")
    Iterable<Department> read(){
        return departmentService.findAll();
    }

    @PutMapping("/department")
    Address update(@RequestBody Department department){
        return departmentService.save(department);
    }

    @DeleteMapping("/department/{id}")
    void delete(@PathVariable Id id){
        departmentService.deleteById(id);
    }
}
