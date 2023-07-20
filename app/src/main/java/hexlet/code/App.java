package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        showMenu();
    }
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Запуск игры Greet
                Cli.greetUser();
                break;
            case 2:
                // Запуск игры Even
                EvenGame.startGame();
                break;
            case 0:
                // Выход из игры
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                showMenu();
                break;
        }
    }
}
