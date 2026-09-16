package Java_Programs;

import java.math.BigInteger;
abstract class NumberUtility {
    static boolean isEven(int number) {
        return number % 2 == 0;
    }
    static boolean isPrime(int number) {
        BigInteger bi = new BigInteger(Integer.toString(number));
        return bi.isProbablePrime(10);
    }
    static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    static int reverse(int number) {
        String str = Integer.toString(number);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
    static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
    static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    
}
