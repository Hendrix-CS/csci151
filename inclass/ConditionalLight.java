package holiday;

public class ConditionalLight implements Light{

    private String current;

    public ConditionalLight() {
        current = "RED";
    }

    @Override
    public String getColor() {
        return current;
    }

    @Override
    public void nextColor() {
        if (current.equals("RED")) {
            current = "GREEN";
        } else if (current.equals("GREEN")) {
            current = "YELLOW";
        } else if (current.equals("YELLOW")) {
            current = "RED";
        }
    }

    public int testing() {
        return 7;
    }
}
