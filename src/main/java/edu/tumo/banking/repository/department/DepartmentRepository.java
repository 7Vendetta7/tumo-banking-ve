package edu.tumo.banking.repository.department;

import edu.tumo.banking.domain.department.dto.DepartmentDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface DepartmentRepository extends CrudRepository <DepartmentDTO,Id> {
    List<DepartmentRepository> findall();
    DepartmentRepository add(DepartmentRepository department);
    Optional<DepartmentRepository > findBy(Id i);
    void deleteDepartmentRepositoryBy(Id i);
    void deleteAll();

}