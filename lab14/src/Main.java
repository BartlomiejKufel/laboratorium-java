import java.sql.SQLException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDAO dao = new UserDAO();

        printBanner("ATM BANK SYSTEM");
        System.out.print("Podaj nazwę użytkownika: ");
        String username = scanner.nextLine();

        System.out.print("Podaj pin użytkownika: ");
        String pin = scanner.nextLine();

        try{
            if(dao.authenticateUser(username,pin,"admin")){
                System.out.println("Zalogowano jako: ADMINISTRATOR");
                adminMenu(dao, scanner);

            }else if(dao.authenticateUser(username,pin,"user")){
                System.out.println("Zalogowano jako: "+ username.toUpperCase());
                userMenu(dao, scanner, username);
            }
            else
                System.out.println("niepoprawne dane logowania");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }



    private static void adminMenu(UserDAO dao, Scanner scanner) throws SQLException {
        while(true){
            printBanner("MENU ADMINA");
            System.out.println("1. Dodaj nowego użytkownika");
            System.out.println("2. Wyloguj");

            System.out.println("Wybierz opcję");
            int choice = scanner.nextInt();
            scanner.nextLine(); // czyszczenie bufora

            switch (choice){
                case 1: AddNewUserAdmin(dao, scanner);break;
                case 2: Logout();break;

                default:
                    System.out.println("Nie ma takiego wyboru");
            }
        }
    }

    private static void Logout() {
        printBanner("DO WIDZENIA :)");
        System.exit(1);
    }

    private static void AddNewUserAdmin(UserDAO dao, Scanner scanner) throws SQLException {
        printBanner("DODAWANIE UŻYTKOWNIKA");

        System.out.println("Podaj nazwę nowego użytkownika");
        String newUsername = scanner.nextLine();

        System.out.println("Podaj pin nowego użytkownika");
        String newPin = scanner.nextLine();

        dao.addUser(newUsername, newPin);

        pressEnterToContinue(scanner);
    }


    private static void userMenu(UserDAO dao, Scanner scanner, String username) throws SQLException {
        while(true){
            printBanner("MENU UŻYTKOWNIKA");
            System.out.println("1. Wpłata pieniędzy");
            System.out.println("2. Wypłata pieniędzy");
            System.out.println("3. Zmiana pin");
            System.out.println("4. Sprawdź stan konta");
            System.out.println("5. Wyloguj");

            System.out.println("Wybierz opcję");
            int choice = scanner.nextInt();
            scanner.nextLine(); // czyszczenie bufora

            switch (choice){
                case 1: DepositUser(dao, scanner, username);break;
                case 2: WithdrawUser(dao, scanner, username);break;
                case 3: ChangePinUser(dao, scanner, username);break;
                case 4: ShowBalanceUser(dao, scanner, username);break;
                case 5: Logout();break;

                default:
                    System.out.println("Nie ma takiego wyboru");
            }
        }
    }

    private static void ShowBalanceUser(UserDAO dao, Scanner scanner, String username) throws SQLException {
        printBanner("STAN KONTA");

        dao.showBalance(username);

        pressEnterToContinue(scanner);
    }

    private static void ChangePinUser(UserDAO dao, Scanner scanner, String username) throws SQLException {
        printBanner("ZMIANA PINU");

        System.out.println("Podaj nowy pin: ");
        String newUserPin = scanner.nextLine();

        dao.changePin(username, newUserPin);

        pressEnterToContinue(scanner);
    }

    private static void WithdrawUser(UserDAO dao, Scanner scanner, String username) throws SQLException {
        printBanner("WYPŁACANIE PIENIĘDZY");

        System.out.println("Podaj kwotę do wypłacenia: ");
        double withdrawAmount = scanner.nextDouble();

        dao.withdraw(username, withdrawAmount);

        pressEnterToContinue(scanner);
    }

    private static void DepositUser(UserDAO dao, Scanner scanner, String username) throws SQLException {
        printBanner("WPŁACANIE PIENIĘDZY");

        System.out.println("Podaj kwotę wpłaty: ");
        double depositAmount = scanner.nextDouble();

        dao.deposit(username, depositAmount);

        pressEnterToContinue(scanner);
    }

    private static void printBanner(String tittle){
        System.out.println("\n"+"=".repeat(40)); //wyświetlenie znaku "=" 40 razy
        System.out.println("\n"+tittle);
        System.out.println("\n"+"=".repeat(40));
    }

    private static void pressEnterToContinue(Scanner scanner){
        System.out.println("Naciśnij ENTER, aby kontynuować...");
        scanner.nextLine();
    }
}