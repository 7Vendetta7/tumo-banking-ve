package edu.tumo.banking.repository.mappers;

import edu.tumo.banking.domain.user.UserModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<UserModel> {
    @Override
    public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        //UserRowMapper userRowMapper=new UserRowMapper();


    }
}
