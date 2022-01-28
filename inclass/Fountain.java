public class Fountain {

    // Fields
    private int capacity;
    private int amount;
    private boolean running;

    // Constructor
    public Fountain(int capacity) {
        this.capacity = capacity;
        amount = 0;
        running = false;
    }

    // Methods
    public void add(int liters) {
        amount += liters;
        if (amount > capacity) {
            amount = capacity;
        } else if (amount <= 0) {
            amount = 0;
            running = false;
        }
    }

    public void toggle() {
        if (!running && amount > 0) {
            running = true;
        } else if (running) {
            running = false;
        }

        /*
        if (amount > 0) {
        running = !running;
        }
         */
    }

    public String look() {
        String s = "";
        if (running) {
            s += "Sploosh! The fountain is on.";
        } else {
            s += "The fountain is off. ";
        }
        return s + "It contains " + amount + " liters of water.";
    }
}
