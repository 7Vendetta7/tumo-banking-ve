package edu.tumo.banking.repository.employee;

import java.util.List;
import java.util.Optional;


public interface EmployeeRepository<EmployeeModel,Long> {
    List<EmployeeModel> findall();
    EmployeeModel add(EmployeeModel employee);
    Optional<EmployeeModel> findBy(Long id);
    void deleteEmployeeModelBy(Long id);
    void deleteAll();
}
