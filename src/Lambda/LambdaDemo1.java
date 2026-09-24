package Lambda;
import java.util.Arrays;
interface Calculator{
    int calculate(int a, int b);
}
public class LambdaDemo1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5,3,2,2,3,4,5,2,3,4,5};
        Calculator add = (a, b) -> a+b;
        Calculator subtract = (a, b) -> a-b;
        Calculator multiply = (a, b) -> a*b;

        System.out.println(add.calculate(2,10));
        System.out.println(subtract.calculate(10,5));
        System.out.println(multiply.calculate(2,4));

        int max = Arrays.stream(arr).summaryStatistics().getMax();
        System.out.println("Max = "+ max);

        int min = Arrays.stream(arr).summaryStatistics().getMin();
        System.out.println("Min = "+ min);


        // return type of .getSum() is long
        long sum = Arrays.stream(arr).summaryStatistics().getSum();
        System.out.println("Sum = "+ sum);
    }
}
