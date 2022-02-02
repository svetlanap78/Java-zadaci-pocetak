package Domaci.Sreda08_12_21;

import java.util.Scanner;

public class Zad2_Suma_Intervala {
    public static void main(String[] args) {
        /*[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].*/

        Scanner sc = new Scanner (System.in);
        System.out.println("Unesite celi broj m: ");
        int m = sc.nextInt();
        System.out.println("Unesite celi broj n koji je manji ili jednak broju m: ");
        int n = sc.nextInt();
        int suma = 0;

        for(int i = m; i <=n; i++) {
            System.out.println(i);
            suma = suma + i;
        }
        System.out.println("Suma m,n: " + suma);


    }
}
