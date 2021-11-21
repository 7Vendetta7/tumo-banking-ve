package edu.tumo.banking.domain.employee.model;

public class EmployeeModel {

    Long employeeID;
    protected int departmentID;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected float salary;
    protected boolean employeeStatus;
    public EmployeeModel() {
    }
    public EmployeeModel(Long employeeID) {
        this.employeeID = employeeID;
    }

    public EmployeeModel(Long employeeID, int departmentID, String firstName,
                       String lastName, int age, float salary, boolean employeeStatus) {
        this.employeeID = employeeID;
        this.departmentID = departmentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.employeeStatus = employeeStatus;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(boolean employeeStatus) {
        this.employeeStatus = employeeStatus;
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
