package Domaci.Pastebin;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
      //  3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.
        //5= 543210
        //5= 012345
        Scanner sc = new Scanner(System.in);

        System.out.print("Uneti br. n: ");
        int n = sc.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 0; i <= n; i++ ) {
            System.out.println(i);
            }

        }
    }

