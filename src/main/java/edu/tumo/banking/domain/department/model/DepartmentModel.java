package edu.tumo.banking.domain.department.model;

public class DepartmentModel {

    Long departmentID;
    protected int employeeID;
    protected String departmentName;

    public DepartmentModel() {
    }

    public DepartmentModel(Long departmentID, int employeeID, String departmentName) {
        this.departmentID = departmentID;
        this.employeeID = employeeID;
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
