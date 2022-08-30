public class Warmups {

    // def question1(x : int) -> int:
    //    z = ((x - 32) * (5/9))
    //    return z

    public static double question1(int x) {
        double z = ((x - 32) * (5.0/9.0));
        return z;
    }

    // def first_two(word):
    //    first_letters = word[:2]
    //    last_letters = word[-2:]
    //    if first_letters == last_letters:
    //        return True
    //    else:
    //        return False

    public static boolean firstTwo(String word) {
        String firstLetters = word.substring(0, 2);
        int len = word.length();
        String lastLetters = word.substring(len - 2);
        return firstLetters.equals(lastLetters);
    }

    public static boolean doubleLetter(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            char c = word.charAt(i);
            char next = word.charAt(i + 1);
            if (c == next) {
                return true;
            }
        }
        return false;
    }

    // Triangular Numbers
    public static int triangleNumber(int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += i;
        }
        return sum;
    }

    // Found line 52 from reading https://hendrix-cs.github.io/csci151/labs/codingbat.html

    public static int[] allTriangleNums(int n) {

        int x;

        int[] nums = new int[n];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = triangleNumber(i + 1);
        }

        return nums;
    }



    public static void main(String[] args) {
        System.out.println(question1(100));
        System.out.println(firstTwo("racecar"));
        System.out.println(firstTwo("beebe"));
        System.out.println(doubleLetter("bookkeeper"));
        System.out.println(doubleLetter("lambda"));
        System.out.println(triangleNumber(5));
        System.out.println(triangleNumber(4));
        int[] mynums = allTriangleNums(5);
        String s = "[";
        for (int x : mynums) {
            s += x + ",";
        }
        s += "]";
        System.out.println(s);
    }
}
