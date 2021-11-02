package edu.tumo.banking.domain.address.dto;

public class AddressDTO {
    private long addressID;
    private int bankID;
    private String zipCode;
    private String country;
    private String province;
    private String city;
    private String street;
    private String buildingNumber;

    public AddressDTO() {

    }

    public AddressDTO(int addressID, int bankID, String zipCode, String country, String province,
                      String city, String street, String buildingNumber) {
        this.addressID = addressID;
        this.bankID = bankID;
        this.zipCode = zipCode;
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    public long getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
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
