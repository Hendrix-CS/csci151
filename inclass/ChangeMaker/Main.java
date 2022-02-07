package change;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BetterCoin[] coins = BetterCoin.values();
        for (int i = 0; i < coins.length; i++) {
            System.out.println(coins[i] + " = " + coins[i].getMaterial());
            System.out.println(coins[i] + " = " + coins[i].getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("How much change do you need in cents? ");
        int change = sc.nextInt();

        int biggest = coins.length - 1;
        int sum = 0;

        System.out.println("Your change is ....");

        while (sum != change) {
            sum += coins[biggest].getValue();
            if (sum > change) {
                sum -= coins[biggest].getValue();
                biggest--;
            } else {
                System.out.println(coins[biggest]);
            }
        }

    }
}
