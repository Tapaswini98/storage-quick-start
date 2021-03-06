package emp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;

public class EmployeeImplementation implements EmployeeInterface {
    ObjectMapper objectMapper = new ObjectMapper();
    HashMap<String, Object> hash = new HashMap<String, Object>();

    @Override
    public void create(Employee employee) {
        try {
            hash = objectMapper.readValue(new File("target/employee.json"), new TypeReference<HashMap<String, Object>>() {
            });
            if(hash.containsKey(employee.getId())){
                System.out.println("This Key is already present.Try another key.");
            }
            else {
                hash.put(employee.getId(), employee);
                objectMapper.writeValue(new File("target/employee.json"), hash);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void read(Employee employee) {
            try {
                hash = objectMapper.readValue(new File("target/employee.json"), new TypeReference<HashMap<String, Object>>() {
                });
                if(hash.isEmpty())
                {
                    System.out.println("There is no data in the Storage System.");
                }
                else
                    {
                      System.out.println(hash);
                   }
            } catch (Exception e) {
                e.printStackTrace();
            }
        //}
    }

    @Override
    public boolean delete(String id) {
        if (hash.containsKey(id)) {
            try {
                hash = objectMapper.readValue(new File("target/employee.json"), new TypeReference<HashMap<String, Object>>() {
                });
                hash.remove(id);
                objectMapper.writeValue(new File("target/employee.json"), hash);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("The Key is not present in storage system");
        }
        return false;
    }

}
