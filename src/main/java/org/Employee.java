package org;

public class Employee {
    private String id;
    private String name;
    private String Department;
    private String Designation;

    public Employee(){
        super();
    }
    public Employee(String id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        Department = department;
        Designation = designation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }
}
