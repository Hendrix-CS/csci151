public class LightsOut {

    // Data Members
    // true is on, false is off
    private LightState[][] grid;

    // Constructor
    public LightsOut(int size) {
        grid = new LightState[size][size];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (Math.random() > 0.5) {
                    grid[i][j] = LightState.ON;
                } else {
                    grid[i][j] = LightState.OFF;
                }
            }
        }
    }

    // Methods
    public void toggle(int y, int x) {
        // switch current spot
        grid[x][y] = grid[x][y].opposite();

        // switch the neighbors
        if (x < grid.length - 1) {
            grid[x + 1][y] = grid[x + 1][y].opposite();
        }
        if (x > 0) {
            grid[x - 1][y] = grid[x - 1][y].opposite();
        }
        if (y < grid.length - 1) {
            grid[x][y + 1] = grid[x][y + 1].opposite();
        }
        if (y > 0) {
            grid[x][y - 1] = grid[x][y - 1].opposite();
        }
    }

    public boolean isSolved() {
        // When all are false, the game is solved
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == LightState.ON) {
                   return false;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == LightState.ON) {
                    ret += "@";
                } else {
                    ret += ".";
                }
            }
            ret += "\n";
        }
        return ret;
    }
}
