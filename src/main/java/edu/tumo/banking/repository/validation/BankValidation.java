package edu.tumo.banking.repository.validation;

import edu.tumo.banking.domain.bank.model.BankModel;
import org.springframework.stereotype.Component;

@Component
public class BankValidation {
    public boolean validateForNull(BankModel bankModel) {
        if (bankModel.getBankName() == null) {
            System.out.println("Name of bank is null  ");
            return false;
        }
        if (bankModel.getAddress() == null) {
            System.out.println("Address of bank is null ");
            return false;
        }
        if (bankModel.getBankID()==null){
            System.out.println("ID of bank is null for ");
            return false;
        }
        return true;
    }
}
