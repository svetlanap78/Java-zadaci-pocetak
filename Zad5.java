package Domaci.Pastebin;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {

       // 5. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.
//5= 543210-1-2-3-4-5...-14
        //
Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ceo pozitivan broj: ");
        int n = sc.nextInt();

        for (int i = -14; i <= 2 * n; i++) {
            System.out.println(i);
        }


    }
}
