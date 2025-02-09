package src.ext.com.test;

import java.util.Scanner;

import static java.lang.System.out;

public class Discount {
    public static void main(String[] ar) {
        Scanner userInput = new Scanner(System.in);
            out.print("Input your Amount to pay: ");
            short amount = 0;
            if (userInput.hasNextShort()) {
                amount = userInput.nextShort();
            } else {
                System.out.println("Invalid input! Setting amount to 0.");
            }
            if (amount > 1000) {
                out.println("After discount total amount to pay :" + (amount - amount / 20));
            } else if (amount < 1000 && amount >= 500) {
                out.println("After discount total amount to pay :" +(amount - amount / 10) );
            } else {
                out.println("Total amount to pay :" + amount);
            }
    }
}
