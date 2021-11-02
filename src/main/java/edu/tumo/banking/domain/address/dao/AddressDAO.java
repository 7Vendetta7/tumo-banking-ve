package edu.tumo.banking.domain.address.dao;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.domain.address.model.AddressModel;
import edu.tumo.banking.repository.address.AddressRepository;
import org.springframework.data.annotation.Id;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;


//public  class
public abstract class AddressDAO implements AddressRepository<AddressModel,Id> {
//
//    private final JdbcTemplate jdbcTemplate ;
//
//
//
//    @Override
//    public AddressModel mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//        Customer customer = new Customer();
//        customer.setID(rs.getLong("ID"));
//        customer.setName(rs.getString("NAME"));
//        customer.setAge(rs.getInt("AGE"));
//        customer.setCreatedDate(rs.getTimestamp("created_date").toLocalDateTime());
//
//        return customer;
//
//    }
//
//    protected AddressDAO(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//
//
//    @Override
//    public List<AddressDTO> findall() {
//        return null;
//    }
//
//    @Override
//    public AddressDTO add(AddressDTO address) {
//        return null;
//    }
//
//    @Override
//    public Optional<AddressDTO> findBy(Id i) {
//        return Optional.empty();
//    }
//
//    @Override
//    public void deleteAddressDTOBy(Id i) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
}
