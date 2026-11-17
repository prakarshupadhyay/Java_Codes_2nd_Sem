// throwing an exception when the element of the array is negative or 0.
package Java_Programs;
class myException extends Exception {
    public myException(String str) {
        super(str);
    }
}

public class CustomException {
    static void check(int a) throws myException {
        if (a <= 0) {
            throw new myException("Value of the array element is negative or 0");
        } else {
            System.out.println("Value of the array element is: " + a);
        }
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, -4, 5,0, 6 };
        for (int i = 0; i < arr.length; i++) {
            try {
                check(arr[i]);
            } catch (myException ex) {
                System.out.println("Value is Negative or 0 at index: " + i);
                System.out.println(ex.getMessage());
            }
        }
    }
}


