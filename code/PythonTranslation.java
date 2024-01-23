package testing;

public class PythonTranslation {

    // Write a Python function to convert a temperature given in
    // Fahrenheit to the equivalent temperature in Celsius.

    /*
    def f_to_c(temp: float) -> float:
        c = (temp - 32) * (5/9)
        return c
    */
    public static double fToC(double temp) {
        return (temp - 32) * (5.0/9);
    }

    // Write a Python function to determine if a given word has
    // the same two first letters as the last two letters.

    /*
    def check(word: str) -> bool:
       f_half = word[:2]
       l_half = word[-2:]
       if f_half.lower() == l_half.lower():
           return True
       else:
           return False
     */
    public static boolean check(String word) {
        String f_half = word.substring(0, 2);
        String l_half = word.substring(word.length() - 2);
        return f_half.toLowerCase().equals(l_half.toLowerCase());
    }

    // Triangular numbers follow the pattern of 0, 1, 3, 6, 10, 15, 21, etc.
    // Write a Python function to calculate the nth Triangular number.

    /*
    def triangle(n: int) -> n:
        i = 0
        x = 0
        while i != n:
            x = x + i
            i += 1
        return x
     */
    public static int triangle(int n) {
        int i = 0;
        int x = 0;
        while (i != n) {
            x += i;
            i++;
        }
        return x;
    }


    // Write a Python function to determine if a given word has a double letter,
    // where the same letter is used twice in a row.

    /*
    def doubleletter(word):
        for i in range(len(word) - 1):
            if word[i] == word[i + 1]:
                return True
        return False

     */
    public static boolean doubleLetter(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(fToC(60));
        System.out.println(fToC(32));
        System.out.println(check("happy"));
        System.out.println(check("racecar"));
        System.out.println(check("theth"));
        System.out.println(triangle(4));
        System.out.println(triangle(5));
        System.out.println(doubleLetter("cat"));
        System.out.println(doubleLetter("wiggle"));
        System.out.println(doubleLetter("bookkeeper"));
    }
}