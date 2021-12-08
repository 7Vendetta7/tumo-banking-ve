package edu.tumo.banking.domain.address.dto;

import edu.tumo.banking.validation.address.valueobjects.buildingnumber.BuildingNumber;
import edu.tumo.banking.validation.address.valueobjects.city.City;
import edu.tumo.banking.validation.address.valueobjects.country.Country;
import edu.tumo.banking.validation.address.valueobjects.province.Province;
import edu.tumo.banking.validation.address.valueobjects.street.Street;
import edu.tumo.banking.validation.address.valueobjects.zipcode.ZipCode;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.text.MessageFormat;

/**
 * Description: This class is designed for storing address data coming from "web".
 *              No matter the data is valid or not, we collect it and store into
 *              the instance of the class. It is data-transfer-object and it will
 *              "succeed" by transforming into DAO if the data is valid and will
 *              be "lost" if there is some data (in some or one of the fields)
 *              which does not correspond with our business logic.
 *
 * @author Argishti_Tigranyan
 */

public class AddressDTO {
    @NotNull(message = "{zipCode.error.null.message}")
    @NotEmpty(message = "{zipCode.error.empty.message}")
    @Size(min = 4, max = 4, message = "{zipCode.error.length.message}")
    @ZipCode(message = "{zipCode.error.message}")
    private String zipCode;

    @NotNull(message = "{country.error.null.message}")
    @NotEmpty(message = "{country.error.empty.message}")
    @Size(min = 2, max = 70, message = "{country.error.length.message}")
    @Country(message = "{country.error.message}")
    private String country;

    //@NotNull(message = "{province.error.null.message}")
    //@NotEmpty(message = "{province.error.empty.message}")
    @Size(min = 2, max = 50, message = "{province.error.length.message}")
    @Province(message = "{province.error.message}")
    private String province;

    @NotNull(message = "{city.error.null.message}")
    @NotEmpty(message = "{city.error.empty.message}")
    @Size(min = 2, max = 50, message = "{city.error.length.message}")
    @City(message = "{city.error.message}")
    private String city;

    @NotNull(message = "{street.error.null.message}")
    @NotEmpty(message = "{street.error.empty.message}")
    @Size(min = 2, max = 50, message = "{street.error.length.message}")
    @Street(message = "{street.error.message}")
    private String street;

    @NotNull(message = "{buildingNumber.error.null.message}")
    @NotEmpty(message = "{buildingNumber.error.empty.message}")
    @Size(min = 1, max = 10, message = "{buildingNumber.error.length.message}")
    @BuildingNumber(message = "{buildingNumber.error.message}")
    private String buildingNumber;

    public AddressDTO(){}

    public AddressDTO(String zipCode, String country, String province, String city, String street, String buildingNumber) {
        this.zipCode = zipCode;
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
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
    public String toString(){
        return MessageFormat.format("{0} {1} {2} {3} {4} {5}",
                zipCode,
                country,
                province,
                city,
                street,
                buildingNumber);
    }
}
