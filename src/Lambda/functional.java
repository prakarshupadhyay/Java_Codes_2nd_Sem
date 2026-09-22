package Lambda;

public class functional {
    interface Calculate {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {
        Calculate addition = (a, b) -> a + b;
        Calculate subtraction = (a, b) -> a - b;
        Calculate multiplication = (a, b) -> a * b;
        Calculate division = (a, b) -> a / b;

        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + addition.calculate(num1, num2));
        System.out.println("Subtraction: " + subtraction.calculate(num1, num2));
        System.out.println("Multiplication: " + multiplication.calculate(num1, num2));
        System.out.println("Division: " + division.calculate(num1, num2));
    }
}