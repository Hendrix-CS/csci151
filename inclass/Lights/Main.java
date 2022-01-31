package blinkers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many times do you want to blink? ");
        int times = sc.nextInt();

        Light light = new ArrayLight();
        for (int i = 0; i < times; i++) {
            System.out.println(light.getColor());
            light.nextColor();
        }
    }
}
