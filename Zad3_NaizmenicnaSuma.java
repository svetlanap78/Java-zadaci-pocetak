package Domaci.Sreda08_12_21;

import java.util.Scanner;

public class Zad3_NaizmenicnaSuma {
    public static void main(String[] args) {

       /* Korisnik unosi vrednost broja n (int) sa konzole. Na standardni izlaz ispisati resenje izraza:
        1 - 2 + 3 - 4.... (+/-) n.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = sc.nextInt();
        int suma = 0;
        /*sta radi: ide od i=1, pita da li je deljiv sa 2, nije ide na suma + 1 i sada je suma 2
        pita da li je 2 delivo sa 2 jeste onda oduzmi i, i sada je rezlutat od i -1, pita da li je 3 delivo sa 2
        nije dakle dodaj + i = dakle sa da je i = 2, pita da li je 2 deljivo sa dva jeste onda oduzmi -4 sada je
        rez -2, pita da li je 5 deljivo sa 2 nije onda saberi -2 + 5 = 3
        *
        * */
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0) {
                System.out.println(i);
                suma = suma - i;
            } else {
                suma = suma + i;
            }
        }
        System.out.println("Resenje od n je: " + suma);

// 10 = 1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10


    }
}
