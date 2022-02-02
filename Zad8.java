package Domaci.Pastebin;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        /*8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
        "Dobrodosao u {x}. razred, {ime} {prezime}",
                pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda.
      A ako korisnik nije djak ispisati jednu odgovarajucu poruku od:
        "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime");
        String ime = sc.next();
        System.out.println("Unesite prezime");
        String prezime = sc.next();
        System.out.println("Unesite godinu rodjenja");

        int godRodjenja = sc.nextInt();
        int razred = 2021 - godRodjenja - 6;

        if ( godRodjenja >= 2015) {
            System.out.println(ime + " " + prezime + " tek treba da zapocnete skolovanje" );
        } else if ( godRodjenja <= 2014 && godRodjenja >=2003) {
            System.out.println("Dobro dasao u " + " " + razred + " " + ime + " " + prezime  );
        } else  if (godRodjenja <=2002) {
            System.out.println( ime + " " + prezime + " zavrsili ste skolovanje");
        }


    }
}
