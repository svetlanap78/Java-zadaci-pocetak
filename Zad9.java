package Domaci.Pastebin;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
/*
        9. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3,
        "Buzz" ako je deljiv sa 5,
        "Zazz" ako je deljiv sa 7 i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan broj: ");
        int n = sc.nextInt();

        /* 10
        1 -
        2 -
        3 fizz
        4
        5 buzz
        6 fizz
        7 zazz
        8
        9fizz
        10
        15 fizz buzz
        *
        35 buzzzazz
        *
        *
        *
        * */


        for (int i = 1; i <= n ; i++){
            if (i % 5 == 0 && i % 7 ==0) {
                System.out.println(i + ": BuzzZazz");
            } else if (i % 3 == 0 && i % 7==0 ) {
                System.out.println(i + ": FizzZazz");
            } else if (i % 3 == 0 && i % 5==0 ) {
                System.out.println(i + ": FizzBazz");
            } else if (i % 7==0) {
                System.out.println(i + ": Zazz");
            } else if (i % 5 == 0) {
                System.out.println(i + ": Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + ": Fizz");
            } else {
                System.out.println(i + ":");
            }


            /*(i % 3 == 0) {
                System.out.println( i + " Fizz");
            }  else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
            }
            } else if
            } else {
                    System.out.println(i + ":");
                }*/
            }
        }


    }
