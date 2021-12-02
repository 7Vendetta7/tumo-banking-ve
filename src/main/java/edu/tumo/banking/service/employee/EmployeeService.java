package edu.tumo.banking.service.employee;

import edu.tumo.banking.domain.employee.model.EmployeeModel;

import java.util.List;

public interface EmployeeService {
    List<EmployeeModel> findAll();
    EmployeeModel add(EmployeeModel employeeModel);
    EmployeeModel update(EmployeeModel employeeModel);
    EmployeeModel findById(Long id);
    void deleteEmployeeModelById(Long id );
}
