package edu.tumo.banking.repository.employee;

import edu.tumo.banking.domain.employee.model.EmployeeModel;
import edu.tumo.banking.repository.mappers.EmployeeRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<EmployeeModel> findall () {
        String sql = "select * from employee";
        List<EmployeeModel> banks=jdbcTemplate.query(sql, new EmployeeRowMapper());
        return banks;

    }

    @Override
    public void update(EmployeeModel employee) {
        String sql = "insert into employee values(null,?,?,?,?,?,?,?,?)";
        int status = jdbcTemplate.update(sql, employee.getEmployeeId(),employee.getFirstName(),
                employee.getLastName(),employee.getAge(),employee.getSalary());
        if(status != 0){
            System.out.println("Employee data updated for ID " + employee.getEmployeeId());
        }else{
            System.out.println("No Employee found with ID " + employee.getEmployeeId());
        }

    }

    @Override
    public Optional<EmployeeModel> findBy(Long id) {
        String sql = "SELECT * FROM employee WHERE ID = ?";
        EmployeeModel employeeModel = jdbcTemplate.queryForObject(sql,
                new EmployeeRowMapper(),id);
        return Optional.ofNullable(employeeModel);
    }

    @Override
    public void deleteEmployeeModelBy(Long id) {
        int status = jdbcTemplate.update("delete from employee where id = ?",id);
        if(status != 0){
            System.out.println("Employee data deleted for ID " + id);
        }else{
            System.out.println("No Employee found with ID " + id);
        }
    }

}
