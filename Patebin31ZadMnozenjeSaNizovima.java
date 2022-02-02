package Domaci.Sreda15_12_21;

import java.util.Scanner;

public class Patebin31ZadMnozenjeSaNizovima {
/*    public static void main(String[] args) {

       *//* 31. Napisati funkciju koja racuna proizvod 3 broja.
                Hint kako citati ove zadatke:
        - ... racuna proizvod 3 broja = proseldjuje joj se 3 broja (imace 3 argumenta)
                - funkciju koja racuna = vraca odgovarajuci podatak (nece biti void nego nesto konkretno)*//*

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite 3 elementa u niz: ");
        int[]niz = new int[3];
        for (int i = 0; i < niz.length; i++){
            niz[i] = sc.nextInt();
        }
        System.out.println(proizvod3(niz));
    }

    public static int proizvod3 (int[]x) {
        int z = x[0] * x[1] * x[2];
        return z;
    }*/
}
