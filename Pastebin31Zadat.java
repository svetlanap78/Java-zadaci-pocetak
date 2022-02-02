package Domaci.Sreda15_12_21;

import java.util.Scanner;

public class Pastebin31Zadat {
    public static void main(String[] args) {
        /*31. Napisati funkciju koja racuna proizvod 3 broja.
        Hint kako citati ove zadatke:
        - ... racuna proizvod 3 broja = proseldjuje joj se 3 broja (imace 3 argumenta)
                - funkciju koja racuna = vraca odgovarajuci podatak (nece biti void nego nesto konkretno)*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Ispisite brojeve n");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(proizvod(n,n2,n3));

    }
    public static int proizvod (int x, int y, int z) {
        int c = x * y * z;
        return(c);
    }

}
