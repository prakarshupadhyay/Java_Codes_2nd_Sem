import java.util.Scanner;

public class ReversingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        String reversedString = reversed.toString();

        System.out.println("Reversed string: " + reversedString);

        String nameArr[] = str.split("[ ]");
        StringBuilder sb1 = null;
        StringBuilder reversedName = new StringBuilder();
        for (String name : nameArr) {
            sb1 = new StringBuilder(name);
            reversedName.append(sb1.reverse().toString() + " ");
        }
        System.out.println("Reversed names: " + reversedName.toString());
        System.out.println("string length: " + str.length());
        System.out.println("Reversed string length: " + reversedString.length());
        sc.close();
        

    }
}
