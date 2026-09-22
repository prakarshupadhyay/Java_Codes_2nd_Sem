package Lambda;

interface Calculate {
    void calculate(int a, int b);
    static void display(){
        System.out.println("This is a static method in functional interface");
        processData();
    }
    private static void processData(){
        System.out.println("This is a private method in functional interface used to process data");
    }
}
class MyCalculate implements Calculate{
    @Override
    public void calculate(int a, int b){
        System.out.println("The sum of " + a + " and " + b + " is: " + (a+b));
    }
}

public class Functional_Interface {
    public static void main(String[] args){
        Calculate.display();
        MyCalculate obj = new MyCalculate();
     
        obj.calculate(5, 3);

        Calculate obj1 = (a, b) -> System.out.println("The product of " + a + " and " + b + " is: " + (a*b));
        obj1.calculate(5, 3);
    }

}


