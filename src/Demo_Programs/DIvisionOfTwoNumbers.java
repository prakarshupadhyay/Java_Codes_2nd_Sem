package Demo_Programs;
// class with an object of division
class division{
    public int divide(int a, int b) {
        return a / b;
    }
}
public class DIvisionOfTwoNumbers {
    public static void main(String[] args) {
        division d = new division();
        int result = d.divide(10, 0);
        System.out.println("The result of division is: " + result);

        int [] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[2]);
        //System.out.println(arr[5]); //ArrayIndexOutOfBoundsException

        String str = null;
       // System.out.println(str); //NullPointerException

        String s = "Prakarsh";
        //System.out.println(s.charAt(9)); //StringIndexOutOfBoundsException

        String str1 = "20r";
        System.out.println(Integer.parseInt(str1) + 20); //NumberFormatException
    }
    
}
