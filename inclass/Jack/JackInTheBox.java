public class JackInTheBox {

    // Fields
    private int cranks;
    private int threshold;

    // Constructor
    public JackInTheBox(int threshold) {
        this.cranks = 0;
        this.threshold = threshold;
    }

    // Methods
    public boolean isOpen() {
        return cranks >= threshold;
    }

    /*
    String crank() will increase the stored cranks by
    one when the toy is not open. If after the crank
    the toy is not open, the function should return
    “DoBeDoBeDo...”, otherwise it should return “BOO!”
     */
    public String crank() {
        if (!isOpen()) {
            cranks++;
            if (!isOpen()) {
                return "DoBeDoBeDo...";
            } else {
                return "BOO!";
            }
        }
        return "";
    }

    /*
    void close() will reset the remembered
    cranks to zero, but only if the toy is open.
     */
    public void close() {
        if (isOpen()) {
            cranks = 0;
        }
    }

}
