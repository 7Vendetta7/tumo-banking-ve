package edu.tumo.banking.domain.department.model;

public class DepartmentModel {

    Long departmentID;
    private int employeeID;
    private int addressID;
    private String departmentName;

    public DepartmentModel() {
    }

    public DepartmentModel(Long departmentID, int employeeID, int addressID, String departmentName) {
        this.departmentID = departmentID;
        this.employeeID = employeeID;
        this.addressID = addressID;
        this.departmentName = departmentName;
    }

    public long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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
