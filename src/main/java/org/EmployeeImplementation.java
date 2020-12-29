package org;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;

public class EmployeeImplementation implements EmployeeInterface {
    ObjectMapper objectMapper = new ObjectMapper();
    Employee employee = new Employee();
    HashMap<String, Object> hash = new HashMap<String, Object>();
    @Override
    public void create(Employee employee) {
       try {
           objectMapper.writeValue(new File("target/employee.json"), hash);
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }

    @Override
    public Employee  read(String id) {
        try {
            hash = objectMapper.readValue(new File("target/employee.json"), new TypeReference<HashMap<String, Object>>() {
            });
            hash.put(employee.getId(),employee);

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public boolean delete(String id) {
       return false;
    }

}
