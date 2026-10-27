package Java_Programs;
import java.util.ArrayList;
import java.util.Collections;

class student {
    int id;
    String name;
    student(int i, String n) {
        id = i;
        name = n;
    }
    public int getid() {
        return id;
    }
}
public class ArrayListDemo {
    public static void main(String[] args) {
        student s1 = new student(101, "John");
        student s2 = new student(102, "Steve");
        student s3 = new student(103, "Bill");
        student s4 = new student(104, "Ram");

        ArrayList<student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        al.stream().forEach((student obj) -> System.out.println(obj.id + " " + obj.name));

        System.out.println("===============After Sorting=============");
        Collections.sort(al, (obj1, obj2) -> obj2.getid() - obj1.getid());
        al.stream().forEach((student obj) -> System.out.println(obj.id + " " + obj.name));
    }
}
