package edu.tumo.banking.domain.address.model;

import lombok.*;

import java.time.Instant;

/**
 * Description: This class is designed for storing valid data on it. Each time we
 *              we "get some data from web" and that data passes the validation
 *              we save that for example at our database and return AddressModel
 *              instance which is "lite version" of the DAO. The main goal of this
 *              datatype is again: working with valid data.
 *
 * @author Argishti_Tigranyan
 */

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class AddressModel {

    private final Long id;

    private final String zipCode;

    private final String country;

    private final String province;

    private final String city;

    private final String street;

    private final String buildingNumber;

    private final Instant createdDate;

    public Long getId() {
        return id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public static class AddressModelBuilder{
        private Long id;
        private String zipCode;
        private String country;
        private String province;
        private String city;
        private String street;
        private String buildingNumber;
        private Instant createdDate;

        public AddressModelBuilder id(Long id){
            this.id = id;
            return this;
        }

        public AddressModelBuilder zipCode(String zipCode){
            this.zipCode = zipCode;
            return this;
        }

        public AddressModelBuilder country(String country){
            this.country = country;
            return this;
        }

        public AddressModelBuilder province(String province){
            this.province = province;
            return this;
        }

        public AddressModelBuilder city(String city){
            this.city = city;
            return this;
        }

        public AddressModelBuilder street(String street){
            this.street = street;
            return this;
        }

        public AddressModelBuilder buildingNumber(String buildingNumber){
            this.buildingNumber = buildingNumber;
            return this;
        }

        public AddressModelBuilder createdDate(Instant createdDate){
            this.createdDate = createdDate;
            return this;
        }

        public AddressModel build() {
            return new AddressModel(this);
        }
    }

    public AddressModel(AddressModelBuilder addressModelBuilder){
        this.id = addressModelBuilder.id;
        this.zipCode = addressModelBuilder.zipCode;
        this.country = addressModelBuilder.country;
        this.province = addressModelBuilder.province;
        this.city = addressModelBuilder.city;
        this.street = addressModelBuilder.street;
        this.buildingNumber = addressModelBuilder.buildingNumber;
        this.createdDate = addressModelBuilder.createdDate;
    }
}
