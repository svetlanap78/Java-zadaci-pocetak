package Domaci.Sreda08_12_21;

import java.util.Scanner;

public class Zad1_DupliFaktorijel {
    public static void main(String[] args) {
        /* [Dupli faktorijel] Napisati program koji racuna dupli faktorijel unetg broja n.
        Dupli faktorijel broja n je:
        n!! = n * (n-2) * (n-4) * ... * (2 ili 1) */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj");
        int n = sc.nextInt();
        int fakt = 1 ;

        for (int i = n; i > 1; i-=2) {
            fakt = fakt * i;
        }
        System.out.println("Dupli faktorijel broja je: " + fakt);






    }
}
