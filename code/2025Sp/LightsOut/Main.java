public class Main {
    public static void main(String[] args) {
        LightsOut game = new LightsOut(5);
        System.out.println("Welcome to Lights Out!");
        // Set up a random game
        game.randomize();
        System.out.println(game);

        // Let the player pick a space

        // Toggle that space
        game.toggle(9, 3);
        System.out.println("New Board:");
        System.out.println(game);

        // Check if all the lights are out

        // If not, repeat

    }
}