package holiday;

public class ArrayLight implements HolidayLight {

    private String[] colors;
    private int current;

    public ArrayLight() {
        colors = new String[3];
        colors[0] = "RED";
        colors[1] = "GREEN";
        colors[2] = "BLUE";
        colors[3] = "YELLOW";
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
