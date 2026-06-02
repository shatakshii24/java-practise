import java.util.Scanner;

public class Employeeloginattempts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPassword = "admin123";
        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Login Successful!");
                break;
            } else {
                attempts--;
                System.out.println("Wrong Password!");
                System.out.println("Attempts Left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Account Locked!");
        }

        sc.close();
    }
}