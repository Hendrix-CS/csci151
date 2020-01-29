package games;

import java.util.Scanner;

public class LightsOut {

    private boolean[][] grid;

    public LightsOut(int size) {
         grid = new boolean[size][size];
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]) {
                    s += "X";
                } else {
                    s += ".";
                }
            }
            s += "\n";
        }
        return s;
    }

    public boolean isSolved() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void randomize() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (Math.random() > 0.5) {
                    grid[i][j] = true;
                }
            }
        }
    }

    public void toggle(int x, int y) {
        grid[x][y] = !grid[x][y];
        if (x + 1 < grid.length) {
            grid[x + 1][y] = !grid[x + 1][y];
        }
        if (x - 1 >= 0) {
            grid[x - 1][y] = !grid[x - 1][y];
        }
        if (y + 1 < grid.length) {
            grid[x][y+1] = !grid[x][y+1];
        }
        if (y - 1 >= 0) {
            grid[x][y - 1] = !grid[x][y - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LightsOut game = new LightsOut(3);
        game.randomize();
        while (!game.isSolved()) {
            System.out.println(game);
            System.out.println("X? ");
            int x = sc.nextInt();
            System.out.println("Y? ");
            int y = sc.nextInt();
            try {
                game.toggle(x, y);
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Invalid Move");
            }
        }
        System.out.println(game);
        System.out.println("Hooray!");
    }
}
