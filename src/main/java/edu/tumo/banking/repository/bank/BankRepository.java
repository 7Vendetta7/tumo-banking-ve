package edu.tumo.banking.repository.bank;

import java.util.List;
import java.util.Optional;

public interface BankRepository<BankModel, Long>{
    List<BankModel> findall();
    BankModel update(BankModel bank);
    Optional<BankModel> findBy(Long id);
    void deleteBankModelBy(Long id );
}