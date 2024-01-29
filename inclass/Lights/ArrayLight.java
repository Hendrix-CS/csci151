package blinkers;

public class ArrayLight implements Light{

    // Fields
    private final String[] colors;
    private int current;

    // Constructor
    public ArrayLight() {
        colors = new String[] {"RED", "GREEN", "BLUE", "ORANGE"};
        current = 0;
    }

    @Override
    public String getColor() {
        return colors[current];
    }

    @Override
    public void nextColor() {
        current++;
        current %= colors.length;
    }
}
