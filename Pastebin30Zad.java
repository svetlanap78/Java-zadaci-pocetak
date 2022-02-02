package Domaci.Sreda15_12_21;

import java.util.Scanner;

public class Pastebin30Zad {
    public static void main(String[] args) {
        /*30. -//-. Izracunati proizvod elemenata tog niza.
                Primer: [2, 4] -> 8
        30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite 2 elementa niza: ");
        int[] niz = new int[2];

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        proizvod2Clana(niz);
        //System.out.println(proizvod2Clana());
    }

    public static void proizvod2Clana(int[]x) {
        int proizvod = x[0] * x[1];
        System.out.println(proizvod);
        }

    }


