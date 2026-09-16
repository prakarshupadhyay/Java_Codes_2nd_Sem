package Java_Programs;
import java.util.Scanner;

class Employee {
    void perforDuty(String name) {
        System.out.println(name + ": Performs General Duty");
    }
}
class Manager extends Employee {
    @Override 
    void perforDuty(String name) {
        System.out.println(name + ": Performs Managerial Duty");
    }
}
class Waiter extends Employee {
    @Override
    void perforDuty(String name) {
        System.out.println(name + ": Performs Waiter Duty");
    }
}
class chef extends Employee {
    @Override 
    void perforDuty(String name) {
        System.out.println(name + ": Prepares Food");
    }
}
class cashier extends Employee {
    @Override 
    void perforDuty(String name) {
        System.out.println(name + ": Handles Cash Transactions");
    }
}
public class Inheritance_Demo3 {
    public static void main(String [] args){
    // using switch case statement
    Employee emp = new Employee();
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of the employee (1. Manager, 2. Waiter, 3. Chef, 4. Cashier): ");
    int number = scanner.nextInt();
        switch (number) {
            case 1 -> emp = new Manager();
            case 2 -> emp = new Waiter();
            case 3 -> emp = new chef();
            case 4 -> emp = new cashier();
        }
        if (emp instanceof Manager) {
            emp.perforDuty("Manager");
        } else if (emp instanceof Waiter) {
            emp.perforDuty("Waiter");
        } else if (emp instanceof chef) {
            emp.perforDuty("Chef");
        } else if (emp instanceof cashier) {
            emp.perforDuty("Cashier");
        } else {
            emp.perforDuty("Employee");
        scanner.close();
        }
    }
}

