import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordManager manager = new PasswordManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Password Manager ====");
            System.out.println("1. Add Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    manager.addAccount();
                    break;
                case 2:
                    manager.viewAccounts();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
