package edu.tumo.banking.repository.bank;

import edu.tumo.banking.domain.bank.model.BankModel;

import java.util.List;
import java.util.Optional;

public class BankRepositoryImpl implements BankRepository<BankModel,Long> {
    @Override
    public List<BankModel> findall() {
        return null;
    }

    @Override
    public BankModel add(BankModel bank) {
        return null;
    }

    @Override
    public Optional<BankModel> findBy(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteBankDTOBy(Long id) {

    }

    @Override
    public void deleteAll() {

    }
}
