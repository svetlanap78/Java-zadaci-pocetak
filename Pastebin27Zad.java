package Domaci.Sreda15_12_21;

import java.util.Scanner;

public class Pastebin27Zad {
    public static void main(String[] args) {

        /*  27 *Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
    Primer: [1, 2, 3, 4, 5] -> 1 3 5
            27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Odredite broj clanova niza: ");
        int duzinaNiza =sc.nextInt();
        System.out.println("Unesite brojeve u niz");
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            niz[i] = sc.nextInt();
        }
        ispis(niz);
    }
    public static void ispis (int[]x){
        for (int j = 0; j < x.length; j+=2){
            System.out.println(x[j]);
        }

    }

}
