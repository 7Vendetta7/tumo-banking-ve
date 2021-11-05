package edu.tumo.banking.domain.bank.model;

public class BankModel {
    Long bankID;
    private String bankName;
    private String address;

    public BankModel() {
    }

    public BankModel(Long bankID, String bankName, String address) {
        this.bankID=bankID;
        this.bankName = bankName;
        this.address = address;
    }

    public long getBankID() {
        return bankID;
    }

    public void setBankID(Long bankID) {
        this.bankID = bankID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
