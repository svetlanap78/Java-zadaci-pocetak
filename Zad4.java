package Domaci.Pastebin;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        //4. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.

//-5 = 0 -1 -2 -3 -4 -5 -4 -3 -2 -1 -0
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti negativan broj: ");
        int n = sc.nextInt();

        for (int i = 0; i >= n; i--) {
            System.out.println(i);
        }
        for (int i = n; i <=0 ; i++) {
            System.out.println(i);

        }

    }
}
