public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        HolidayLight first = new Light();
        //HolidayLight first = new MemoryLight();

        String s = first.getColor();
        System.out.println("The color is " + s);

        for (int i = 0; i < 7; i++) {
            first.changeColor();
            System.out.println("The color is " + first.getColor());
        }
    }
}