public class Testing2 {

    // print("Hello!")
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println(temp(17));
        System.out.println(problem2("racecar") + " should be false");
        System.out.println(problem2("decide") + " should be true");
        System.out.println(Triangle_Number(1) + " should be 0");
        System.out.println(Triangle_Number(2) + " should be 1");
        System.out.println(Triangle_Number(3) + " should be 3");
        System.out.println(Triangle_Number(4) + " should be 6");
        System.out.println(DoubleLetter("car") + " should be false");
        System.out.println(DoubleLetter("bookkeeper") + " should be true");
    }

    /*
        def temp(deg: float) -> float:
            celc = (deg - 32) * (5/9)
            return celc
     */
    public static double temp(double deg) {
        return (deg - 32) * (5.0 / 9);
    }

    /*
    def problem2(word: str) -> bool:
       first_two = word[0:2]
       last_two = word[-2:]
       if first_two == last_two:
           return True
       else:
           return False
     */
    public static boolean problem2(String word) {
        String first_two = word.substring(0,2);
        String last_two = word.substring(word.length() -2, word.length());
        return first_two.equals(last_two);
    }

    /*
    def Triangle_Number(n_times: int) -> int:
        n = 1
        number = 0
        while n < n_times:
            number += n
            n += 1
        return number
     */

    public static int Triangle_Number(int n_times) {
        int n = 1;
        int number = 0;
        while (n < n_times) {
            number += n;
            n++;
        }
        return number;
    }

    /*
    	def DoubleLetter(Word: str) -> bool:
            check = False
            for i in range(len(Word) - 1):
                if Word[i] == Word[i+1]:
                    check = True
            return check
     */

    public static boolean DoubleLetter(String Word) {
        boolean check = false;
        //for i in range(len(Word) - 1) {
        for (int i = 0; i < Word.length() - 1; i++) {
            if (Word.charAt(i) == Word.charAt(i + 1)) {
                check = true;
                break;
            }
        }
        return check;
    }
}
