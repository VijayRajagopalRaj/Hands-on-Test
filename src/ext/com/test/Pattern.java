package src.ext.com.test;

import static java.lang.System.out;

public class Pattern {
    public static void main(String[] args) {
        int k = 5;
        for (int i = 0; i <= k - 1; i++) {
            for (int j = 0; j <= k - 1; j++) {
                int temp = j - i;
                if (temp <= 0) {
                    out.print(5 - j);
                } else {
                    out.print(5 - i);
                }
            }
            out.println(" ");
        }
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 5; j >= i; j--) {
//                out.print("* ");
//            }
//            out.println(" ");
//        }

//        for (int i = 5; i >=0 ; i--) {
//            for (int j = 0; j <6; j++) {
//                if (j==i || j>i){
//                    out.print(" *");
//                }else{
//                    out.print("  ");
//                }
//            }
//            out.println(" ");
//        }
    }
}
