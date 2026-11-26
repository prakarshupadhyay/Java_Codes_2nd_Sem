package Java_Programs;
import java.util.Comparator;
class Employee {
    int id;
    String name;
    int age;

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
    Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class EmployeeIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getId(), e2.getId());
    }
}

class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getAge(), e2.getAge());
    }
}
public class CustomSorting {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(3, "Alice", 30),
            new Employee(1, "Bob", 25),
            new Employee(2, "Charlie", 28)
        };

        System.out.println("Sorting by ID:");
        java.util.Arrays.sort(employees, new EmployeeIdComparator());
        for (Employee e : employees) {
            e.display();
        }

        System.out.println("\nSorting by Name:");
        java.util.Arrays.sort(employees, new EmployeeNameComparator());
        for (Employee e : employees) {
            e.display();
        }

        System.out.println("\nSorting by Age:");
        java.util.Arrays.sort(employees, new EmployeeAgeComparator());
        for (Employee e : employees) {
            e.display();
        }
    }
}
