package edu.tumo.banking.service.bank;

import edu.tumo.banking.domain.bank.model.BankModel;
import edu.tumo.banking.repository.bank.BankRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImpl implements BankService{

    private final BankRepositoryImpl bankRepositoryImpl;

    @Autowired

    public BankServiceImpl(BankRepositoryImpl bankRepositoryImpl){
        this.bankRepositoryImpl=bankRepositoryImpl;
    }

    @Override
    public List<BankModel> findAll() {
        return bankRepositoryImpl.findAll();
    }

    @Override
    public BankModel add(BankModel bankModel) {
        return bankRepositoryImpl.add(bankModel);
    }

    @Override
    public BankModel update(BankModel bank) {
        return bankRepositoryImpl.update(bank);
    }

    @Override
    public Optional<BankModel> findById(Long id) {
        Optional<BankModel> bankModel= bankRepositoryImpl.findById(id);
        return bankModel;
    }

    @Override
    public void deleteBankModelBy(Long id) {
        bankRepositoryImpl.deleteBankModelBy(id);
    }
}
