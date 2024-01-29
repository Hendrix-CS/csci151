package blinkers;

public class Main {
    public static void main(String[] args) {
 
        Light light = new ArrayLight();
        System.out.println(light.getColor());

        for (int i = 0; i < 8; i++) {
            light.nextColor();
            System.out.println(light.getColor());

        }
    }
}
