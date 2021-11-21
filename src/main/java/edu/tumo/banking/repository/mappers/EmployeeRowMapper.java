package edu.tumo.banking.repository.mappers;

import edu.tumo.banking.domain.employee.model.EmployeeModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<EmployeeModel> {
    public EmployeeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setEmployeeId(rs.getLong("employeeid"));
        employeeModel.setFirstName(rs.getString("name"));
        employeeModel.setLastName(rs.getString("surname"));
        employeeModel.setAge(rs.getInt("age"));
        employeeModel.setSalary(rs.getFloat("salary"));
        employeeModel.setAddress(rs.getString("address"));
        employeeModel.setDepartment(rs.getString("department"));
        employeeModel.setEmployeeStatus(rs.getBoolean("employeeStatus"));
        employeeModel.setBankId(rs.getLong("bankId"));
        return employeeModel;
    }
}