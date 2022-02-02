package Domaci.Petak17_12_21;

import java.util.Scanner;

public class Pastebin41Zad {

    public static double prosek (double[] x){
        double suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma = suma + x[i];
        }
        double prosecnaVrednost = suma / x.length;

        return prosecnaVrednost;

    }

    public static void main(String[] args) {

      //  41. Napisati funkciju koja racuna prosecnu vrednost double[] niza

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzina = sc.nextInt();
        double [] niz = new double [duzina];

        for(int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i+1) + " clan niza");
            niz[i] = sc.nextDouble();
        }
        System.out.println("Prosecna vrednost niza je " + prosek(niz));

    }

}
