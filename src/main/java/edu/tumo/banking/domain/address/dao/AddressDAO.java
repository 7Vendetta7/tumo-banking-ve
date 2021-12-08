package edu.tumo.banking.domain.address.dao;

import edu.tumo.banking.domain.employee.dao.EmployeeDAO;

import javax.persistence.*;
import java.time.Instant;

/**
 * Description: This class is designed for collecting valid data and storing it at the database,
 *              why we say "valid data", because no invalid data can reach to this level and be
 *              represented as instance of this class. Moreover all the data accessed from the
 *              database at first is stored into instance of this class and in most cases it is
 *              converted into AddressModel, which is "lite" version of this class.
 *
 * @author Argishti_Tigranyan
 */

@Entity(name = "TBL_ADDRESS")
public class AddressDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private boolean enabled;

    private String zipCode;

    private String country;

    private String province;

    private String city;

    private String street;

    private String buildingNumber;

    private Instant createdDate;

    private Instant updatedDate;

    private Instant removedDate;

    @OneToOne(mappedBy = "address")
    private EmployeeDAO employeeDAO;

    public AddressDAO() {
    }

    public AddressDAO(String zipCode, String country, String province, String city, String street, String buildingNumber) {
        this.zipCode = zipCode;
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Instant updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Instant getRemovedDate() {
        return removedDate;
    }

    public void setRemovedDate(Instant removedDate) {
        this.removedDate = removedDate;
    }
}
