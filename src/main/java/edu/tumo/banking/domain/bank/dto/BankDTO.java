package edu.tumo.banking.domain.bank.dto;

public class BankDTO {
    private Long bankID;
    private String bankName;
    private String address;

    public BankDTO() {
    }

    public BankDTO(Long bankID, String bankName, String address) {
        this.bankID = bankID;
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

}
