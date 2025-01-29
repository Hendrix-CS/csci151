public class MemoryLight implements HolidayLight {

    // Fields
    private String[] colors = new String[3];
    private int currentIndex;

    // Constructor
    public MemoryLight() {
        currentIndex = 0;
        colors[0] = "RED";
        colors[1] = "BLUE";
        colors[2] = "GREEN";
    }

    // Methods
    @Override
    public String getColor() {
        return colors[currentIndex];
    }

    @Override
    public void changeColor() {
        currentIndex++;
        if (currentIndex == colors.length) {
            currentIndex = 0;
        }
    }

}
