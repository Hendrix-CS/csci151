public class Main {
    public static void main(String[] args) {
        JackInTheBox jack = new JackInTheBox(5);
        for (int i = 0; i < 7; i++) {
            System.out.println(jack.crank());
        }
        jack.close();
        for (int i = 0; i < 7; i++) {
            System.out.println(jack.crank());
        }

    }

}
