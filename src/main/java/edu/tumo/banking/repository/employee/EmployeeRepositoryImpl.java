package edu.tumo.banking.repository.employee;

import edu.tumo.banking.domain.employee.model.EmployeeModel;
import edu.tumo.banking.repository.mappers.EmployeeRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

public class EmployeeRepositoryImpl implements EmployeeRepository<EmployeeModel, Long> {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    private EmployeeRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<EmployeeModel> findAll() {
        String sql = "select * from employee";
        List<EmployeeModel> employees=jdbcTemplate.query(sql, new EmployeeRowMapper());
        return employees;
    }

    @Override
    public EmployeeModel add(EmployeeModel employeeModel) {
        String sql= "insert into employeeModel values(null,?,?,?,?,?,?,?,?)";
        int inserted =jdbcTemplate.update(sql,
                employeeModel.getEmployeeId(),
                employeeModel.getFirstName(),
                employeeModel.getLastName(),
                employeeModel.getAge(),
                employeeModel.getSalary(),
                employeeModel.getAddress(),
                employeeModel.getDepartment(),
                employeeModel.getEmployeeStatus(),
                employeeModel.getBankId());
        if (inserted == 1) {
            return employeeModel;
        }
        return null;
    }

    @Override
    public EmployeeModel update(EmployeeModel employee) {
        String sql = "update employee set first_name=?, last_name=?, age=?, salary=?, address=?,department=?,employees_status=?,bank_id=?";
        int status = jdbcTemplate.update(sql, employee.getEmployeeId(),employee.getFirstName(),
                employee.getLastName(),employee.getAge(),employee.getSalary(),employee.getAddress(),employee.getDepartment(),
                employee.getEmployeeStatus(),employee.getBankId());
        if(status != 0){
            System.out.println("Employee data updated for ID " + employee.getEmployeeId());
        }else{
            System.out.println("No Employee found with ID " + employee.getEmployeeId());
        }
        return employee;
    }

    @Override
    public Optional<EmployeeModel> findById(Long id) {
        String sql = "SELECT * FROM employee WHERE ID = ?";
        EmployeeModel employeeModel =null;
        try {
            employeeModel = jdbcTemplate.queryForObject(sql,
                    new EmployeeRowMapper(), id);
        }catch(DataAccessException ex){
            System.err.println("Employee not found with id "+ id);
        }
        return Optional.ofNullable(employeeModel);
    }

    @Override
    public void deleteEmployeeModelById(Long id) {
        int status = jdbcTemplate.update("delete from employee where id = ?",id);
        if(status != 0){
            System.out.println("Employee data deleted for ID " + id);
        }else{
            System.out.println("No Employee found with ID " + id);
        }
    }

}
