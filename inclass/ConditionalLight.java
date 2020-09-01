package holiday;

public class ConditionalLight implements HolidayLight{

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
            current = "BLUE";
        } else if (current.equals("BLUE")) {
            current = "RED";
        }
    }

    public int testing() {
        return 7;
    }
}
