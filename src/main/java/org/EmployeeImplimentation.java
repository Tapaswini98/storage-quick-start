package org;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;

public class EmployeeImplimentation implements EmployeeInterface {
    ObjectMapper objectMapper = new ObjectMapper();
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
    public HashMap<String ,Object> read(Employee employee) {
        try {
            hash = objectMapper.readValue(new File("target/employee.json"), new TypeReference<HashMap<String, Object>>() {
            });
            hash.put(employee.getId(),employee);

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return hash;
    }

    @Override
    public void delete(Employee employee) {

    }

}
