package edu.tumo.banking.domain.employee.dto;

public class EmployeeDTO {
    private Long employeeID;
    private String firstName;
    private String lastName;
    private Integer age;
    private Float salary;
    private String address;
    private String department;
    private Boolean employeeStatus;
    private Long bankId;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long employeeID, String firstName, String lastName, Integer age, Float salary, String address, String department, Boolean employeeStatus, Long bankId) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.address = address;
        this.department = department;
        this.employeeStatus = employeeStatus;
        this.bankId = bankId;
    }

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(Boolean employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }
}
