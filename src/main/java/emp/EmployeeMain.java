package emp;

import java.util.Scanner;


public class EmployeeMain extends EmployeeImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
             Employee employee = new Employee();
               switch(choice) {
                  case 1:
                    employee.setId(scanner.next());
                    employee.setName(scanner.next());
                    employee.setDepartment(scanner.next());
                    employee.setDesignation(scanner.next());
                    e.create(employee);
                    break;
                  case 2:
                    e.read(employee);
                    break;
                  case 3:
                    System.out.println("Enter the ID of the value You want to delete :");
                    String iid = scanner.next();
                    e.delete(iid);
                    break;
                  case 4:
                    System.out.print("Quitting....");
                    System.out.println("Thank You for visiting the program");
                    System.exit(0);
                    break;
                  default:
                    System.out.println("Enter a choice from above options.");
                    break;
              }

        }

    }
}
