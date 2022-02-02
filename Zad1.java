package Domaci.Pastebin;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        //Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.

        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti broj n");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Paran");
        } else {
            System.out.println("Neparan");
        }



    }

}
