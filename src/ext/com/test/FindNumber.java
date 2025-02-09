package src.ext.com.test;

import java.util.Scanner;

import static java.lang.System.out;

public class FindNumber {
    public static void main(String[] arg) {
        Scanner dataValue = new Scanner(System.in);
        boolean isNeed = true;
        while (isNeed) {
            out.print("Enter the value to find Positive or Negative :");
            int value = dataValue.nextInt();
            if (value >= 0) {
                out.println("The given value is positive");
            } else {
                out.println("The given value is Negative");
            }
            out.print("Need to continue to check more value enter T to stop F :");
            String getValue = dataValue.next();
            if ("T".equalsIgnoreCase(getValue)) {
                isNeed = true;
            } else {
                isNeed = false;
                out.println("End");
            }
        }
    }
}
