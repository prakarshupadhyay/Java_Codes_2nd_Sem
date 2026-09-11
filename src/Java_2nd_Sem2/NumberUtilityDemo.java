package Java_2nd_Sem2;

import static Java_2nd_Sem2.NumberUtility.*;
import java.util.Scanner;

public class NumberUtilityDemo {

    public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int factorial = factorial(number);
        int reversedNumber = reverse(number);
        int sumDigits = sumOfDigits(number);
        boolean isEvenNumber = isEven(number);
        boolean isPrimeNumber = isPrime(number);
        boolean isPalindromeNumber = isPalindrome(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
        System.out.println("Reversed number of " + number + " is: " + reversedNumber);
        System.out.println("Sum of digits of " + number + " is: " + sumDigits);
        System.out.println(number + " is even: " + isEvenNumber);
        System.out.println(number + " is prime: " + isPrimeNumber);
        System.out.println(number + " is palindrome: " + isPalindromeNumber);
    }
}
}