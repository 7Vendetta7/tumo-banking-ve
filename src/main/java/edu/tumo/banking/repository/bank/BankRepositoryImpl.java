package edu.tumo.banking.repository.bank;

import edu.tumo.banking.domain.bank.model.BankModel;
import edu.tumo.banking.repository.mappers.BankRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
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
    public List<BankModel> findAll() {
        String sql = "select * from bank";
        List<BankModel> banks=jdbcTemplate.query(sql, new BankRowMapper());
        return banks;

    }

    @Override
    public BankModel add(BankModel bankModel) {
        String sql = "insert into bankModel values(null,?,?,?,?,?,?,?,?)";
        int inserted= jdbcTemplate.update(sql, bankModel.getBankID(),bankModel.getBankName(),bankModel.getAddress());
        if (inserted == 1) {
            return bankModel;
        }
        return null;
    }

    @Override
    public BankModel update(BankModel bank) {
       String sql = "update bank set bank_name=?, adress=?";
        int update = jdbcTemplate.update(sql, bank.getBankName(),bank.getAddress());
        if(update != 0){
            System.out.println("Employee data updated for id" + bank.getBankID() );
        }else{
            System.out.println("No Employee found with id " + bank.getBankID());
        }
        return bank;
    }

    @Override
    public Optional<BankModel> findById(Long id) {
        String sql = "SELECT * FROM bank WHERE ID = ?";
        BankModel bankModel=null;
        try{
            bankModel = jdbcTemplate.queryForObject(sql,new BankRowMapper(), id);
        }catch (DataAccessException ex) {
            System.err.println("Bank not found with id "+ id);
        }
        return Optional.ofNullable(bankModel);
    }

    @Override
    public void deleteBankModelBy (Long id)
    {
        int status = jdbcTemplate.update("delete from bank where bank_id = ?",id);
        if(status != 0){
            System.out.println("Bank data deleted for ID " + id);
        }else{
            System.out.println("No Bank found with ID " + id);
        }
    }
}