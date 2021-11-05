package edu.tumo.banking.repository.department;

import edu.tumo.banking.domain.department.model.DepartmentModel;

import java.util.List;
import java.util.Optional;

public class DepartmentRepositoryImpl implements DepartmentRepository<DepartmentModel,Long>{
    @Override
    public List<DepartmentModel> findall() {
        return null;
    }

    @Override
    public DepartmentModel add(DepartmentModel department) {
        return null;
    }

    @Override
    public Optional<DepartmentModel> findBy(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteDepartmentModelBy(Long id) {

    }

    @Override
    public void deleteAll() {

    }
}
