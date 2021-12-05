package edu.tumo.banking.validation;

import edu.tumo.banking.domain.bank.model.BankModel;


public class BankValidation {
    public boolean validateBankModel(BankModel bankModel) {
        if(bankModel==null)
        {
            System.out.println(" Bank is null  ");
            return false;
        }
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
