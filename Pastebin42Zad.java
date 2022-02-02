package Domaci.Petak17_12_21;

import java.util.Scanner;

public class Pastebin42Zad {

    public static String[] provera(String[] niz) {
        boolean da = false;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i].equals("Marija") || niz[i].equals("Petar")) {
                System.out.println("Postoji ime " + niz[i] + " u nizu." +
                        "");
                da = true;
                break;
            }
        }
        if (da == false) {
            System.out.println("U nizu ne postoje imena Marija ili Petar.");
        }

        return niz;
    }

        public static void main (String[] args) {
            // 42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

            Scanner sc = new Scanner(System.in);
            System.out.println("Upisite duzinu niza imena: ");
            int duzina = sc.nextInt();
            String[] niz = new String[duzina];

            for (int i = 0; i < niz.length; i++) {
                System.out.println("Unesite " + (i + 1) + " ime");
                niz[i] = sc.next();
            }
            provera(niz);
        }

    private static class niz {
    }
}





