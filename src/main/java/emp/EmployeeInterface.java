package emp;


import emp.Employee;

public interface EmployeeInterface {
    public abstract void create(Employee employee);
    public abstract void read(Employee employee);
    public abstract boolean delete(String id);
}
