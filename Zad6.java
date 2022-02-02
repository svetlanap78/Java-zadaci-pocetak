package Domaci.Pastebin;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {

      //  6. Ispisati proizvod prvih n celih brojeva [1, n].
        //n=5
        // 1 * 2 * 3 * 4 * 5

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan broj: ");
        int n = sc.nextInt();
        int suma = 1;
        for (int i = 1; i <= n; i++) {
            suma = suma * i;
        }
        System.out.println("Proivod je: " + suma);



    }
}
