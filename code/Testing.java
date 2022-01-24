public class Testing {

    // print("Hello!")
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println(temp(17));
    }

    /*
        def temp(deg: float) -> float:
            celc = (deg - 32) * (5/9)
            return celc
     */
    public static double temp(double deg) {
        return (deg - 32) * (5.0 / 9);
    }
}
