package edu.tumo.banking.domain.employee.dto;

import edu.tumo.banking.domain.address.dto.AddressDTO;
import edu.tumo.banking.validation.employee.valueobjects.firstName.FirstName;
import edu.tumo.banking.validation.employee.valueobjects.lastName.LastName;
import edu.tumo.banking.validation.employee.valueobjects.position.Position;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.text.MessageFormat;

/**
 * Description: This class is designed for storing employee data coming from "web".
 *              No matter the data is valid or not, we collect it and store into
 *              the instance of the class. It is data-transfer-object and it will
 *              "succeed" by transforming into DAO if the data is valid and will
 *              be "lost" if there is some data (in some or one of the fields)
 *              which does not correspond with our business logic.
 *
 * @author Argishti_Tigranyan
 */

public class EmployeeDTO {

    @NotNull(message = "{age.error.null.message}")
    @Range(min = 18, max = 130, message = "{age.error.value.message}")
    private Integer age;

    @NotNull(message = "{salary.error.null.message}")
    @Positive(message = "{salary.error.value.message}")
    private Integer salary;

    @NotNull(message = "{firstName.error.null.message}")
    @NotEmpty(message = "{firstName.error.empty.message}")
    @Size(min = 2, max = 50, message = "{firstName.error.length.message}")
    @FirstName(message = "{firstName.error.message}")
    private String firstName;

    @NotNull(message = "{lastName.error.null.message}")
    @NotEmpty(message = "{lastName.error.empty.message}")
    @Size(min = 2, max = 50, message = "{lastName.error.length.message}")
    @LastName(message = "{lastName.error.message}")
    private String lastName;

    @NotNull(message = "{position.error.null.message}")
    @NotEmpty(message = "{position.error.empty.message}")
    @Size(min = 2, max = 100, message = "{position.error.length.message}")
    @Position
    private String position;

    @Valid
    @NotNull
    private AddressDTO address;

    public EmployeeDTO(Integer age, Integer salary, String firstName, String lastName, String position, AddressDTO address) {
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
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

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} {1} {2} {3} {4} {5}",
                firstName,
                lastName,
                age,
                position,
                salary,
                address);
    }
}
