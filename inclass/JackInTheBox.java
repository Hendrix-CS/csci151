package creepy;

public class JackInTheBox {

    private int threshold;
    private int current;

    public JackInTheBox(int threshold) {
        this.threshold = threshold;
        current = 0;
    }

    public boolean isOpen() {
        return current == threshold;
    }

    public void close() {
        if (isOpen()) {
            current = 0;
        }
    }

    public String crank() {
        if (!isOpen()) {
            current++;
            if (isOpen()) {
                return "Boo!";
            } else {
                return "DoBeDoBeDo...";
            }
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        JackInTheBox jack = new JackInTheBox(5);

        for (int i = 0; i < 7; i++) {
            System.out.println(jack.crank());
        }
        jack.close();
        for (int i = 0; i < 3; i++) {
            System.out.println(jack.crank());
        }
    }
}
