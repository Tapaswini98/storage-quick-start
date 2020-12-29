package org;


public interface EmployeeInterface {
    public abstract void create(Employee employee);
    public abstract Employee read(String id);
    public abstract boolean delete(String id);
}
