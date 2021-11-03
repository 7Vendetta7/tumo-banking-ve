package edu.tumo.banking.service.department;

import edu.tumo.banking.repository.address.AddressRepository;
import edu.tumo.banking.repository.department.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl {

        private final DepartmentRepository departmentRepository;

        @Autowired
        public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
            this.departmentRepository = departmentRepository;
        }
}
