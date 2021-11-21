package edu.tumo.banking.repository.employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository<EmployeeModel, Long>{
    List<EmployeeModel> findall();
    void update(EmployeeModel bank);
    Optional<EmployeeModel> findBy(Long id);
    void deleteEmployeeModelBy(Long id );
}
