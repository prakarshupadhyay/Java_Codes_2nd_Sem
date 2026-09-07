public class StringDemo {
    public static void main(String[] args) {
        // using scanner for email and password
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println(email);
        System.out.println(password);

        String specialChars = "!@#$%^&*()_+";
        String firstChar = email.charAt(0) + "";
        String lastChar = email.charAt(email.length() - 1) + "";

        if(!specialChars.contains(firstChar) && !specialChars.contains(lastChar) 
                && email.contains("@") && email.contains(".")&&email.endsWith("@gmail.com")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }

        // checking password for special characters, uppercase, lowercase and digits
        boolean hasSpecialChar = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (specialChars.contains(String.valueOf(c))) {
                hasSpecialChar = true;
            }
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        if (hasSpecialChar && hasUpperCase && hasLowerCase && hasDigit) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        scanner.close();

    }
}   