public class Fountain {
    // Fields
    private int capacity;
    private int current;
    private boolean running;

    // Constructor
    public Fountain(int capacity) {
        this.capacity = capacity;
        current = 0;
        running = false;

    }

    // Methods
    public void add(int liters) {
        current += liters;
        current = Math.min(current, capacity);
        current = Math.max(current, 0);
        if (current == 0) {
            running = false;
        }
    }

    public void toggle() {
        running = !running && current > 0;
    }

    public String look() {
        String s = "";
        if (running) {
            s = "Sploosh. The fountain is on. ";
        } else {
            s = "The fountain is off. ";
        }
        s += "It contains " + current + " liters of water.";
        return s;
    }
}
