package org;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;


public class EmployeeMain extends EmployeeImplimentation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //HashMap<String, Object> hashmap = new HashMap<String, Object>();
        Employee employee = new Employee();
        ObjectMapper objectMapper = new ObjectMapper();
        try
        {
            HashMap<String ,Object> hash = objectMapper.readValue(new File("target/employee.json"),new TypeReference<HashMap<String,Object>>(){});

            System.out.println(hash);

            employee.setId(scanner.next());
            employee.setName(scanner.next());
            employee.setDepartment(scanner.next());
            employee.setDesignation(scanner.next());

            hash.put(employee.getId(),employee );
            objectMapper.writeValue(new File("target/employee.json"),hash);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        EmployeeMain e = new EmployeeMain();
        e.create(employee);
        e.read(employee);
        e.delete(employee);
    }
}
