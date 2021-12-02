package edu.tumo.banking.service.employee;


import edu.tumo.banking.domain.employee.model.EmployeeModel;
import edu.tumo.banking.repository.employee.EmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepositoryImpl employeeRepositoryImpl;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepositoryImpl employeeRepositoryImpl) {
        this.employeeRepositoryImpl = employeeRepositoryImpl;
    }

    public List<EmployeeModel> findEmployees() {return employeeRepositoryImpl.findAll();}

    public EmployeeModel addEmployee(EmployeeModel employee) {return employeeRepositoryImpl.add(employee);}

    public Optional<EmployeeModel> findEmployeeById(Long id) {return employeeRepositoryImpl.findById(id);}

    public Optional<EmployeeModel> updateEmployee(EmployeeModel employee) {
        EmployeeModel employee1= employeeRepositoryImpl.update(employee);
        return Optional.of(employee1);
    }

    public void deleteEmployeeById(Long id) {employeeRepositoryImpl.deleteEmployeeModelById(id);}

    @Override
    public List<EmployeeModel> findAll() {
        return null;
    }

    @Override
    public EmployeeModel add(EmployeeModel employeeModel) {
        return null;
    }

    @Override
    public EmployeeModel update(EmployeeModel employeeModel) {
        return null;
    }

    @Override
    public EmployeeModel findById(Long id) {
        return null;
    }

    @Override
    public void deleteEmployeeModelById(Long id) {

    }
}
