package holiday;

public class ArrayLight implements Light {

    private String[] colors;
    private int current;

    public ArrayLight() {
        //colors = new String[]{"RED", "GREEN", "YELLOW"};
        colors = new String[3];
        colors[0] = "RED";
        colors[1] = "GREEN";
        colors[2] = "YELLOW";
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
