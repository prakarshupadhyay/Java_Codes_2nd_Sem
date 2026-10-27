package Java_Programs;

import java.util.Comparator;
import java.util.TreeSet;
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(Comparator.comparing(s -> s.name));

        ts.add(new Student("Rajiv", 1));
        ts.add(new Student("Ajay", 2));
        ts.add(new Student("Gagan", 3));
        ts.add(new Student("Harman", 4));
        ts.add(new Student("Rishita", 5));

        System.out.println("Size of TreeSet: " + ts.size());
        System.out.println(ts);
    }
}

