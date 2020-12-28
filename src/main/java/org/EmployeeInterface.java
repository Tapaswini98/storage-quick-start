package org;

import java.util.HashMap;

public interface EmployeeInterface {
    public abstract void create(Employee employee);
    public abstract HashMap<String,Object> read(Employee employee);
    public abstract void delete(Employee employee);
}
