import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LightsOut game = new LightsOut(5);
        Scanner scanner = new Scanner(System.in);
        System.out.println(game);
        while (!game.isSolved()) {
            try {
                System.out.print("X? ");
                int x = scanner.nextInt();
                System.out.print("Y? ");
                int y = scanner.nextInt();
                game.toggle(y, x);
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Bad input, try again.");
            } catch (InputMismatchException ime) {
                System.out.println("Please use integers only!");
                scanner.next();
            }
            System.out.println(game);
        }
    }
}