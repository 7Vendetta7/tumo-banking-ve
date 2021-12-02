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

    @Override
    public List<EmployeeModel> findAll() {
        return employeeRepositoryImpl.findAll();
    }

    @Override
    public EmployeeModel add(EmployeeModel employeeModel) {
        return employeeRepositoryImpl.add(employeeModel);
    }

    @Override
    public EmployeeModel update(EmployeeModel employeeModel) {
        return employeeRepositoryImpl.update(employeeModel);
    }

    @Override
    public Optional<EmployeeModel> findById(Long id) {
        return employeeRepositoryImpl.findById(id);
    }

    @Override
    public void deleteEmployeeModelById(Long id) {
        employeeRepositoryImpl.deleteEmployeeModelById(id);
    }
}
