import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LightsOut game = new LightsOut(5);
        System.out.println("Welcome to Lights Out!");
        // Set up a random game
        game.randomize();
        System.out.println(game);

        while (!game.isSolved()) {

            try {
                // Let the player pick a space
                System.out.println("Please type an x and y coordinate.");
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                try {
                    // Toggle that space
                    game.toggle(x, y);
                    System.out.println("New Board:");
                    System.out.println(game);
                } catch (ArrayIndexOutOfBoundsException aioobe) {
                    System.out.println("That's not a valid spot.");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Please type integers.");
                scanner.nextLine();
            }
            // Check if all the lights are out

            // If not, repeat
        }
        System.out.println("Congratulations!");

    }
}