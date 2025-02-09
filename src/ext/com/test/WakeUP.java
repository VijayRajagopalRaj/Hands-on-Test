package src.ext.com.test;


import static java.lang.System.out;

public class WakeUP {
    public static void main (String [] arg){
        int i =10;
        for (;i<=50;i++){
            out.print(i+" ");
        }
        i=10;
        out.println(" ");
        while(i<=50){
            out.print(i+++" ");
        }
    }
}
