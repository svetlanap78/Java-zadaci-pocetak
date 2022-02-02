package Domaci.petak_03_12_2021;

import java.util.Scanner;

public class PrviZad_AritmetickeOperacije {
    public static void main(String[] args) {

      /*  Na standardni ulaz se unose dva cela broja.
        Ispisati na standardnom izlazu u zasebnim redovima zbir, razliku, proizvod,
        kolicnik i ostatak deljenja prvog broja drugim
        tim redom.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Uneti prvi broj: ");
        int a = sc.nextInt();
        System.out.println("Uneti drugi broj: ");
        int b = sc.nextInt();

        int zbir = a + b;
        int razlika = a - b;
        int proizvod = a * b;
        double kolicnik = (a * 1.0) / b;
        int ostatak = a % b;

        System.out.println("Zbir brojeva je " + zbir + ".");
        System.out.println("Oduzimanjem se dobije rezultat " + razlika + ".");
        System.out.println("Proizvod unetih brojeva je " + proizvod + ".");
        System.out.println("Deljenjem prvog broja drugim dobije se " + kolicnik + ".");
        System.out.println("Ostatak pri deljenju prvog broja drugim je " + ostatak + ".");

    }
}
