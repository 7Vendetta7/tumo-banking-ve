package edu.tumo.banking.repository.bank;

import edu.tumo.banking.domain.bank.model.BankModel;
import edu.tumo.banking.repository.mappers.BankRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;


public class BankRepositoryImpl implements BankRepository<BankModel, Long> {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BankRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<BankModel> findall() {
        String sql = "select * from bank";
        List<BankModel> employees=jdbcTemplate.query(sql, new BankRowMapper());
        return employees;

    }

    @Override
    public BankModel update(BankModel bank) {
       String sql = "insert into bank values(null,?,?,?,?,?,?,?,?)";
        int status = jdbcTemplate.update(sql, bank.getBankName());
        if(status != 0){
            System.out.println("Employee data updated for ID " + bank.getBankID());
        }else{
            System.out.println("No Employee found with ID " + bank.getBankID());
        }
        return bank;
    }

    @Override
    public Optional<BankModel> findBy(Long id) {
        String sql = "SELECT * FROM bank WHERE ID = ?";
        BankModel bankModel = jdbcTemplate.queryForObject(sql,new BankRowMapper(),
                id);
        return Optional.ofNullable(bankModel);
    }

    @Override
    public void deleteBankModelBy (Long id){
        int status = jdbcTemplate.update("delete from bank where id = ?",id);
        if(status != 0){
            System.out.println("Bank data deleted for ID " + id);
        }else{
            System.out.println("No Bank found with ID " + id);
        }

    }

}