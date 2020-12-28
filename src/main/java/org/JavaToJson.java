package org;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JavaToJson {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Employee employee = new Employee(
                    "1",
                    "Tapaswini",
                    "IT",
                    "Project-head"
            );
            objectMapper.writeValue(new File("target/emp.json"), employee);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
