package Java_Programs;

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
public class Inheritance_demo2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.perforDuty("Employee");
        chef ch = new chef();
        ch.perforDuty("Chef");
        cashier cs = new cashier();
        cs.perforDuty("Cashier");
        Manager mg = new Manager();
        mg.perforDuty("Manager");
        Waiter wt = new Waiter();
        wt.perforDuty("Waiter");
    }
    // using runtime polymorphism
    void performDuty(Employee emp, String name) {
        emp.perforDuty(name);
        emp = new Manager();
        emp.perforDuty("Manager");

        emp = new Waiter();
        emp.perforDuty("Waiter");

        

    }
    
}
