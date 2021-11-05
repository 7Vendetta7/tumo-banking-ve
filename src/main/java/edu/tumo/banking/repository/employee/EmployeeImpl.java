package edu.tumo.banking.repository.employee;

import edu.tumo.banking.domain.employee.model.EmployeeModel;

import java.util.List;
import java.util.Optional;

public class EmployeeImpl implements EmployeeRepository<EmployeeModel,Long>{
    @Override
    public List<EmployeeModel> findall() {
        return null;
    }

    @Override
    public EmployeeModel add(EmployeeModel employee) {
        return null;
    }

    @Override
    public Optional<EmployeeModel> findBy(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteEmployeeModelBy(Long id) {

    }

    @Override
    public void deleteAll() {

    }
}
