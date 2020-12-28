package org;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonToJava {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            String employeeJson = "{\"id\":1,\"name\":\"Tapaswini\",\"department\":\"IT\", \"designation\":\"Project-head\"}";
            //Employee employee = objectMapper.readValue(employeeJson,Employee.class);
            //System.out.println(employee.getName());
            JsonNode jsonNode = objectMapper.readTree(employeeJson);
            String empName = jsonNode.get("name").asText();
            String empId = jsonNode.get("id").asText();
            String empDept = jsonNode.get("department").asText();
            String empDesign = jsonNode.get("designation").asText();
            objectMapper.writeValue(new File("target/employeeNode.txt"),empId + ","+ empName +","+ empDept+","+ empDesign);
        }
        catch(final Exception e){
            e.printStackTrace();
        }

    }
}
