
public class Main {
    /*
    def convert(fah):
        cel = (fah - 32) * (5/9)
        return cel
    */

    public static double convert(int fah) {
        return (fah - 32) * (5 / 9.0);
    }

    /*
    def letters(word: str) -> bool:
        if word[0:2] == word[-2:]:
            if word[1] == word[-1]:
                return True
            else:
                return False
        else:
            return False
     */

    public static boolean letters(String word)
    {
        if (word.charAt(0) == word.charAt(word.length()-2)) {
            if (word.charAt(1) == word.charAt(word.length() - 1)) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static boolean letters2(String word)
    {
        if (word.substring(0, 2).equals(word.substring(word.length() - 2))) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
    def triangle(n: int) -> int:
        i = 0
        counter = 0
        while n != counter:
            counter += 1
            i = i + counter
        return i
     */

    public static int triangle(int n){
        int i = 0;
        int counter = 0;
        while (n != counter) {
            counter++;
            i = i + counter;
        }
        return i;
    }

    public static int[] triangleArray(int n){
        int[] t = new int[20];
        int i = 0;
        int counter = 0;
        while (n != counter) {
            t[counter] = i;
            counter++;
            i = i + counter;
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println(convert(105));
        System.out.println(letters2("momo")); // True?
        System.out.println(triangle(7));
        int[] f = triangleArray(5);
        for (int j : f) {
            System.out.print(j + ",");
        }
    }
}