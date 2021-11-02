package edu.tumo.banking.repository.employee;

import edu.tumo.banking.domain.employee.dto.EmployeeDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface EmployeeRepository extends CrudRepository <EmployeeDTO,Id> {
    List<EmployeeRepository> findall();
    EmployeeRepository add(EmployeeRepository employee);
    Optional<EmployeeRepository> findBy(Id i);
    void deleteEmployeeRepositoryBy(Id i);
    void deleteAll();
}
