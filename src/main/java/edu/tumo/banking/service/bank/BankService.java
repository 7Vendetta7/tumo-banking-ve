package edu.tumo.banking.service.bank;

import edu.tumo.banking.domain.bank.model.BankModel;

import java.util.List;
import java.util.Optional;

public interface BankService {
    List<BankModel> findAll();
    BankModel add(BankModel bankModel);
    BankModel update(BankModel bank);
    Optional<BankModel> findById(Long id);
    void deleteBankModelBy(Long id );
}
