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

    public  List<BankModel> findBanks() {return bankRepositoryImpl.findAll();}

    public BankModel addBank(BankModel bank) {return bankRepositoryImpl.add(bank);}

    public Optional<BankModel> findBankById(Long id) {return bankRepositoryImpl.findById(id);}

    public Optional<BankModel> updateBank(BankModel bank) {
        BankModel bank1= bankRepositoryImpl.update(bank);
        return Optional.of(bank1);
    }

    public void deleteBankById(Long id) {bankRepositoryImpl.deleteBankModelBy(id);}

    @Override
    public List<BankModel> findAll() {
        return null;
    }

    @Override
    public BankModel add(BankModel bankModel) {
        return null;
    }

    @Override
    public BankModel update(BankModel bank) {
        return null;
    }

    @Override
    public BankModel findById(Long id) {
        return null;
    }

    @Override
    public void deleteBankModelBy(Long id) {

    }
}
