public class Light implements HolidayLight{

    // Fields
    private String color;

    // Constructor
    public Light() {
        color = "RED";
    }

    // Methods
    public String getColor() {
        return color;
    }

    public void changeColor() {
        if (color.equals("RED")) {
            color = "BLUE";
        }
        else if (color.equals("BLUE")) {
            color = "GREEN";
        }
        else if (color.equals("GREEN")) {
            color = "RED";
        }
    }

    public void bloop() {

    }

}
