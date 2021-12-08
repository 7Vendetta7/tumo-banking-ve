package edu.tumo.banking.domain.employee.dao;

import edu.tumo.banking.domain.address.dao.AddressDAO;

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

@Entity(name = "TBL_EMPLOYEE")
public class EmployeeDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private boolean enabled;

    private Integer age;

    private Integer salary;

    private String firstName;

    private String lastName;

    private String position;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private AddressDAO address;

    private Instant createdDate;

    private Instant updatedDate;

    private Instant removedDate;

    public EmployeeDAO(){}

    public EmployeeDAO(Integer age, Integer salary, String firstName, String lastName, String position) {
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEnabled(){
        return this.enabled;
    }

    public void setEnabled(boolean enabled){
        this.enabled = enabled;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public AddressDAO getAddress() {
        return address;
    }

    public void setAddress(AddressDAO address) {
        this.address = address;
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
