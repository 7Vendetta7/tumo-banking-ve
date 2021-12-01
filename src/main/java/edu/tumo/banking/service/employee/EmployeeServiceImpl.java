package edu.tumo.banking.service.employee;


import edu.tumo.banking.domain.employee.model.EmployeeModel;
import edu.tumo.banking.repository.employee.EmployeeRepository;
import edu.tumo.banking.repository.employee.EmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {

    private final EmployeeRepositoryImpl employeeRepositoryImpl;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepositoryImpl employeeRepositoryImpl) {
        this.employeeRepositoryImpl = employeeRepositoryImpl;
    }

    public List<EmployeeModel> findEmployees() {return employeeRepositoryImpl.findAll();}

    public EmployeeModel addEmployee(EmployeeModel employee) {return employeeRepositoryImpl.add(employee);}

    public Optional<EmployeeModel> findEmployeeById(Long id) {return employeeRepositoryImpl.findById(id);}

    public Optional<EmployeeModel> updateEmployee(EmployeeModel employee) {return employeeRepositoryImpl.update(employee);}

    public void deleteEmployeeById(Long id) {employeeRepositoryImpl.deleteEmployeeModelById(id);}

}
