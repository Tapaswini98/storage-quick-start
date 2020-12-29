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
    public Employee  read(String id) {
        if(hash.containsKey(id)){
            try {
                hash = objectMapper.readValue(new File("target/employee.json"), new TypeReference<HashMap<String, Object>>() {
                });
                hash.put(employee.getId(), employee);
                System.out.println(hash);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("The Key is not present in storage system");
        }
        return employee;
    }
    @Override
    public void create(Employee employee) {
       try {
           hash.put(employee.getId(),employee);
           objectMapper.writeValue(new File("target/employee.json"), hash);
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }

    @Override
    public boolean delete(String id) {
       if(hash.containsKey(id)){
           hash.remove(id);
           return true;
       }
        return false;

    }

}
