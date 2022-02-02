package Domaci.Sreda15_12_21;

import java.util.Scanner;

public class Pastebin29Zad {
    public static void main(String[] args) {
       /* 29. -//-. Ispisati svaki treci element u obrnutom redosledu.
                Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
        29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj elemenata u nizu: ");
        int[] niz = new int[sc.nextInt()];

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        ispisUnazad(niz);
    }
    public static void ispisUnazad(int[]x) {
        for (int i = x.length - 1; i > 0; i-=3 ){
            System.out.println(x[i]);
        }
    }
}
