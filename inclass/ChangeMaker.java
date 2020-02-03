package money;

import java.util.Scanner;

public class ChangeMaker {

    public static void main(String[] args) {

        Currency[] coins = Currency.values();
        int biggest = coins.length - 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your change? ");
        int change = sc.nextInt();
        while (change > 0) {
            if (change >= coins[biggest].getValue()) {
                change -= coins[biggest].getValue();
                System.out.println(coins[biggest] + coins[biggest].getColor());
            } else {
                biggest--;
            }
        }
        System.out.println("All done!");
    }

}
