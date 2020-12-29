package org;

import java.util.Scanner;


public class EmployeeMain extends EmployeeImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        EmployeeMain e = new EmployeeMain();
        while(true){
            System.out.println("Employee Storage System");
            System.out.println("========================");
            System.out.println("Features:");
            System.out.println("1.Create");
            System.out.println("2.Read");
            System.out.println("3.Delete");
            System.out.println("4.Quit");

            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

               switch(choice) {
                  case 1:
                    employee.setId(scanner.next());
                    employee.setName(scanner.next());
                    employee.setDepartment(scanner.next());
                    employee.setDesignation(scanner.next());
                    e.create(employee);
                    break;
                  case 2:
                    String id = employee.getId();
                    e.read(id);
                    break;
                  case 3:
                    String iid = employee.getId();
                    e.delete(iid);
                    break;
                  case 4:
                    System.out.println("Quitting the program...");
                    break;
                  default:
                    System.out.println("Enter a choice from above options.");
                    break;
              }

            //System.out.println("Thanks for visiting this program...");


        }

    }
}
