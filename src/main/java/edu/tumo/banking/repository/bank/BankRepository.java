package edu.tumo.banking.repository.bank;

import java.util.List;
import java.util.Optional;

public interface BankRepository<BankModel, Long>{
    List<BankModel> findAll();
    BankModel add(BankModel bankModel);
    BankModel update(BankModel bank);
    Optional<BankModel> findById(Long id);
    void deleteBankModelBy(Long id );
}