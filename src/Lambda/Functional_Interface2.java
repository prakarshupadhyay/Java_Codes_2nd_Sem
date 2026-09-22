package Lambda;

import java.util.Arrays;;

public class  Functional_Interface2{
    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i =  1; i < arr.length; i++) {
            arr[i] = i ;
        }

        Arrays.stream(arr).filter(ele -> ele % 2 ==0 ).forEach(ele -> System.out.println(ele));
    }
}