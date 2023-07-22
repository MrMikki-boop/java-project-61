package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {
    private static final int CHOICE_FOR_GREET = 1;
    private static final int CHOICE_FOR_EVEN = 2;
    private static final int CHOICE_FOR_CALC = 3;
    private static final int CHOICE_FOR_GCD = 4;
    private static final int CHOICE_FOR_PROG = 5;
    private static final int CHOICE_FOR_PRIME = 6;
    private static final int CHOICE_FOR_EXIT = 0;
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case CHOICE_FOR_GREET:
                // Запуск игры Greet
                Cli.greetUser();
                break;
            case CHOICE_FOR_EVEN:
                // Запуск игры Even
                EvenGame.startGame();
                break;
            case CHOICE_FOR_CALC:
                // Запуск игры CalcGame
                CalcGame.startGame();
                break;
            case CHOICE_FOR_GCD:
                // Запуск игры GcdGame
                GcdGame.startGame();
                break;
            case CHOICE_FOR_PROG:
                // Запуск игры Progression
                ProgressionGame.startGame();
                break;
            case CHOICE_FOR_PRIME:
                // Запуск игры Prime
                PrimeGame.startGame();
                break;
            case CHOICE_FOR_EXIT:
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
