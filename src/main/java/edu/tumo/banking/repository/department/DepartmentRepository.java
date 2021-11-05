package edu.tumo.banking.repository.department;

import java.util.List;
import java.util.Optional;


public interface DepartmentRepository<DepartmentModel,Long> {
    List<DepartmentModel> findall();
    DepartmentModel add(DepartmentModel department);
    Optional<DepartmentModel> findBy(Long id);
    void deleteDepartmentModelBy(Long id);
    void deleteAll();
}